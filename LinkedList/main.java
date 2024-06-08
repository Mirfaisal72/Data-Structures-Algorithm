public class main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertlast(99);
        list.insert(19,4);


        list.display();
        System.out.println(list.findnode(3));
        System.out.println(list.deleteLast());
        System.out.println(list.deletefirst());
        System.out.println(list.deleteIndex(4));

        list.display();

    }
}
