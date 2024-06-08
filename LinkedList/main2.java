public class main2 {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(13);
        list.insertFirst(23);
        list.insertFirst(43);
        list.insertFirst(65);
        list.insertFirst(78);
        list.insertLast(55);

        list.display();
        list.insert(12,43);
        list.display();
        System.out.println("IN REVERSE");
        list.displayRev();
    }
}
