public class HappyNumber {
    public static void main(String[] args) {
        boolean ans = isHappy(19);
        System.out.println("is Happy Number: "+ ans);
    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = Square(slow);
            fast = Square(Square(slow));
        }while(fast!=slow);
        // here we have reached the point where fast = slow, this means that cycle exists and the number is not a happy number
        // but there is another case where fast = slow but still the cycle doesn't exist and the number is a happy number
        // it is the case where 1 is the tail and the next numbers will also be 1(square of  is 1), therefore slow and fast pointers will also be 1, once they will iterate after, tail thus fast = slow
        // in this case the number will be a happy number, to check it we see if slow is equal to 1 or not if it is this means the number is a happy number
        if(slow == 1){
            return true;
        }
        return false;

    }
    public static int Square(int num){
        int ans = 0;
        while(num>0){
            int rem = num %10;
            ans += rem * rem;
            num = num /10;
        }
        return ans;
    }
}
