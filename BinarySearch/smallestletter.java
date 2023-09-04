public class smallestletter {
    public static void main(String[] args) {
        char[] letters ={'a','b','c','d','f'};
        char ans = smallest(letters,'f');
        System.out.println(ans);
    }
    static char smallest(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // its returning start same as in ceiling problem but here
        // we have to look after the condition that leet code has provided i.e if start == end return 0th index which
        //is done by using the above equation
    }
}
