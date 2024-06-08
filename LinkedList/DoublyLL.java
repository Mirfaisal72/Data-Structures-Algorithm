public class DoublyLL {
    private Node head;
    private int size;
    public DoublyLL() {

        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!= null){
            head.prev = node;
        }
        head = node;

    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public Node findnode(int value){ //Searching an element and it returns its index
        Node node = head;
        while (node!= null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insert(int val ,int after){
        Node p = findnode(after);
        if(p==null){
            System.out.println("DOES NOT EXIST");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node node = head;// we make a node and save the value of head, it is a temp node used for traversing
        while(node!= null){
            System.out.print(node.val + " -> ");
            node= node.next;
        }
        System.out.println("END");

    }

    public void displayRev(){
        Node node = head;
        Node last = null;// we make a node and save the value of head, it is a temp node used for traversing
        while(node!= null){
            last = node;
            node= node.next; // for updating the value of last
        }
        while(last!=null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){

            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
