public class DetectCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; // Creating a cycle
        int length = lengthofCycle(head); // node1 is the head
        ListNode ans = detectcycle(length,head);
        System.out.println(ans.val);

    }
    public static int lengthofCycle(ListNode head) {
        if (head == null)
            return 0;

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode trav = slow; //for traversing through the cycle
                int length = 0;
                do{
                    trav = trav.next;
                    length++;
                }while (trav!=slow);
                return length;
            }
        }
        return 0;
    }
    public static ListNode detectcycle(int length,ListNode head) {
        if (length == 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (length > 0) {
            slow = slow.next;
            length--;
        }
        //keep moving both forward and they will meet at cycle start
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;

        }
        return slow; // both fast and slow will be pointing to same start node
    }
}
