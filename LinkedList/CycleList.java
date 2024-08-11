public class CycleList {
    public static void main(String[] args) {
        // Example usage
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        boolean ans = hasCycle(node1);
        System.out.println("Cycle detected: " + ans);
    }

        public static boolean hasCycle(ListNode head) {
            if (head == null) return false;

            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }
}

