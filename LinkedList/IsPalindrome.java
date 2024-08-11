public class IsPalindrome {
    public static void main(String[] args) {

    }
    public static boolean ispalindrome(ListNode head){
        ListNode mid = middleNode(head);
        ListNode headsecond = reverse(mid);
        ListNode headreverse = headsecond;
        while(headsecond != null){
            if(head.val != headsecond.val){
                break; // not a palindrome
            }
            head = head.next;
            headsecond = headsecond.next;
        }
        reverse(headreverse);
        if(headsecond == null){
            return true;
        }
        return false;
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
