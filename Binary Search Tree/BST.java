public class BST {
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
    public BST(){

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
        return node; //this will return the root node
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
