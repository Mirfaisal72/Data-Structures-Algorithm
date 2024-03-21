public class LL {
    private node head;
    private node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

        public void insertfirst(int val) { // here we make a new node and pass its integer value to it
            node node = new node(val);
            node.next = head; // Here the reference to the next node is given i.e head in case we are adding in the starting of the linked list
            head = node; // Here we update the value of head to the first element it contains

            if(tail == null){ // here tail is set to the last value that is when it only contains head
                tail = head;
            }
            size += 1;
        }

        public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
            node node = new node(val);
            tail.next = node;
            tail = node;
            size++;
        }
        public void insert(int val,int index){
            if(index == 0){
                insertfirst(val);
                return;
            }
            if(index==size){
                insertlast(val);
                return;
            }
            node temp = head;
            for(int i = 1; i<index ;i++){
                temp = temp.next;
            }
            node node = new node(val,temp.next);
            temp.next = node;
            size++;
        }
        public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){ // this is done when there is only one element in the linked list and head , tail both points to the same element therefore
            //when head becomes null using head = head.next we have to make take also null otherwise tail would be pointing to the same element as before
            tail =null;
        }
        size--;
        return val;
        }
        public int deleteLast(){
            if(size<=1){
                deletefirst();
            }
            node secondLast = get(size-2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null;
            return val;
        }
        public node get(int index){
            node node = head;
            for (int i = 1; i < index; i++) {
                node = node.next;
            }
                return node;
        }
        public int deleteIndex(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
           return deleteLast();
        }
        node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
        }
        public node findnode(int value){ //Searching an element and it returns its index
            node node = head;
            while (node!= null){
                if(node.value == value){
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        public void display(){
            node temp = head;
            while (temp!=null){
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");
        }



        public class node {
            private int value;
            private node next;

            public node(int value) {
                this.value = value;
            }

            // this is used for initialization it sets the value of each node to its integer value and its reference to the next node
            public node(int value, node next) {
                this.value = value;
                this.next = next;
            }
    }
}
