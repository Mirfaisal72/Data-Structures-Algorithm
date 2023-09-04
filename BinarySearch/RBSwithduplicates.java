public class RBSwithduplicates {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        int ans = run(arr,2);
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
            if (arr[mid] == arr[start] && arr[end] == arr[mid]) {
                //skip the duplicates nut what if these elements that we skip are pivot
                //So we check if start is pivot
                if (arr[start] > arr[start +1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end -1]) { //arr[end] can not be pivot because of rotation
                    return end -1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || arr[start]==arr[mid] && arr[mid] > arr[end]){
                start = mid +1 ;
            }
            else{
                end = mid -1;
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
