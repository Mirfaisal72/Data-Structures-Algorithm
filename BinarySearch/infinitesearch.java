public class  infinitesearch {
    public static void main(String[] args) {
    int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
    int target = 10;
        System.out.println(findingrange(arr,target));
    }
    // function to find the chunks of numbers
   static int findingrange(int [] arr, int target){
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1;
             end = end + (end - start + 1) * 2; // here old start is used but we need the new start after it thats why we need to update it.
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
   }
   static int BinarySearch(int[] arr, int target, int start, int end){
       while (start <= end) {
           int mid = start + (end - start) / 2;
           if (target < arr[mid]) {
               end = mid - 1;
           } else if (target > arr[mid]) {
               start = mid + 1;
           } else {
               return mid;
           }
       }
       return -1;
   }

}