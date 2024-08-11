public class RotateListK {
    public static void main(String[] args) {

    }
    public static ListNode rotate(ListNode head, int k){
        if(head == null || head.next == null || k <= 0 ){
            return head;
        }
        // locate the last node
        ListNode last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }
        // when this loop ends last will be pointing to the last node
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 1; i <= skip -1 ; i++) {
            newLast = newLast.next;
        }
        // when this loop ends newlast will point to the last of the LL after rotations
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}
