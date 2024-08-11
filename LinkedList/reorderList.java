public class reorderList {
    public static void main(String[] args) {

    }
    public static void reorderList(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hf = head;
        ListNode hs = reverse(head);
        //reorder
        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            ListNode temp2 = hs.next;
            hs.next = hf;
            hs = temp2;
        }
        // setting next of tail to null
        if(hf != null){
            hf.next = null;
        }

    }
    public static ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next != null){ // because f increments by 2 nodes, f can be at last node or second last node
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public static ListNode reverse(ListNode head){
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
        return head;
    }
}
