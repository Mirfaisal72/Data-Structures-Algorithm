public class ReverseNodes_KGroups {
    public static void main(String[] args) {

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null; //for handling null pointer exception

        while(true) {
            ListNode last = prev;
            ListNode newEnd = current;
            // Check if there are at least k nodes remaining
            int count = 0;
            ListNode temp = current;
            while (count < k && temp != null) {
                temp = temp.next;
                count++;
            }
            if (count < k) {
                break; // If fewer than k nodes remain, exit the loop
            }
            for(int i = 0; current != null && i < k;i++){
                next = current.next; // if present is not null than only, move next ahead
                current.next = prev;
                prev = current;
                current = next;
            }
            if(last == null){
                head = prev;
            }
            else{
                last.next = prev;
            }
            newEnd.next = current;
            if(current == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }

}
