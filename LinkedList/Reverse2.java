public class Reverse2 {
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null; //for handling null pointer exception

        //skip the first left -1 nodes
        for(int i = 1;i<=left-1;i++){
            prev = current;
            current = current.next;
        }
        // we need the last that is the prev element before the subset
        // and we need the start of subset that is going to be the new end
        ListNode last = prev;
        ListNode newEnd = current;
        for(int i = 0; current != null &&i < right - left +1;i++ ){
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
        return head;
    }
}
