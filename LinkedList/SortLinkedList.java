public class SortLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(6);
        ListNode node8 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        ListNode sortedlist = sortList(node1);
        printList(sortedlist);
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) { // if no node is present or only one node is present
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0); // this will create a new node with a value 0 for referencing
        ListNode trav = temp; // we make a new node called trav for traversing, its pointer to the first node i.e 0 but the list will start from 0.next (0 is used just for referencing)
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                trav.next = list1;
                list1 = list1.next;
            } else {
                trav.next = list2;
                list2 = list2.next;
            }
            trav = trav.next;
        }
        if (list1 != null) {
            trav.next = list1;
        } else {
            trav.next = list2;
        }
        // Return the merged list starting from the next of dummy node, i.e starting after 0
        return temp.next;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) { // because fast increments by 2 nodes, fast can be at last node or second last node
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null; // split the list into two halves
        }
        return slow;
    }

    public static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println("null");
    }
}
