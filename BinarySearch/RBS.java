public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = run(arr,4);
        System.out.println(ans);
    }
   static int run(int[] arr, int target){
        int pivot = RBS(arr);
       //if pivot is not found
        if (pivot == -1) {
           return Binarysearch(arr,target,0,arr.length-1);
       }
        //if pivot is found, we have 2 sorted arrays
       if (arr[pivot] == target) {
           return pivot;
       }
       if (target >= arr[0]) {
        return Binarysearch(arr,target,0,pivot-1);
       }
       if (target <= arr[0]) {
           return Binarysearch(arr,target,pivot + 1,arr.length -1 );
       }
       return -1;
   }
    static int RBS(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            //here 4 cases are used
            int mid = start + (end - start)/ 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
             if (arr[mid] < arr[mid -1]) {
                return mid-1;
            }
             if(arr[start] >= arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
             }
        }
        return -1;
    }
    static int Binarysearch(int[] arr, int target,int start,int end) {
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
