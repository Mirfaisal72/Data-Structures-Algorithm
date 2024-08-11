public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode tail = new ListNode(8);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = tail;
        printList(head);
        reverse(head);
        printList(tail);
    }
    public static void reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = null; // what if present is null that's why first we keep next also null
        while(present != null){
            next = present.next; // if present is not null than only move next ahead
            present.next = prev;
            prev = present;
            present = next;
        }
        head = prev; // because previous would be the last node

    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
