public class LengthOfCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        int ans = lengthofCycle(node1);
        System.out.println("Length of Cycle " + ans);
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
}
