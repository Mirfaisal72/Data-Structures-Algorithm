public class Tree2Avl {
    public class Node{
        private int value; // we do not make it static because we want to access the Node using objects of class Node
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    // inner class finished
    private Node root;
    public Tree2Avl(){

    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
        if (node == null){
            node = new Node(value);
            return node; // base condition
        }
        if(value<node.value){
            node.left = insert(value,node.left); //this is retuning the root node of the subtree where the node is added
        }
        if(value>node.value){
            node.right = insert(value,node.right); //this is retuning the root node of the subtree where the node is added
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return rotate(node); //this will call the rotate function on the root node that is being returned
    }
    // the rotate function will be first called to the last node, but it won't run, and the recurrence function will be removed from stack
    // as the stack gets free it reaches the function in stack that has to be rotated and the rotate function will run and it will return the root node of the rotated subtree
    // at last it will return the parent/root node
    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // left left case
                return rotateright(node); // this rotation occurs at p
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left right case
                node.left = rotateleft(node.left); // this rotation occurs at c (it is a subtree)
                return  rotateright(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0 ){
                //right right case
                return rotateleft(node); // this rotation occurs at p
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                //right left case
                node.right = rotateright(node.right); // this rotation occurs at c (it is a subtree)
                return rotateleft(node);
            }
        }
        return node; //it is rotating the root node of subtree that has been rotated
    }
    private Node rotateright(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }
    private Node rotateleft(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }
    public int height() {
        return height(root);
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean balanced(){
        return balanced();
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void display() {
        display(this.root, "Root Node: ");
        // The use of this.root ensures the method accesses the root field of the class instance
        // and not the private root variable avoiding ambiguities
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value); // this will print the root node first
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
    public void populate(int[] nums){
        for(int i = 0; i< nums.length; i++){
            insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;
        insert(nums[mid]);
        populateSorted(nums,0,mid);
        populateSorted(nums,mid+1,end);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder() {
        preOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }
    public void postOrder() {
        preOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }
}
