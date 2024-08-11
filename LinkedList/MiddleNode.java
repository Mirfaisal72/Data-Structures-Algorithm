public class MiddleNode {
    public static void main(String[] args) {

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
}
