public class searchinmountainarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,70,4,3,2};
        int ans = search(arr,5);
        System.out.println(ans);
    }
     static int search(int[] arr, int target){
        int peak = peak(arr);
        int firsttry = orderagnostic(arr,target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        return orderagnostic(arr,target,peak + 1, arr.length -1);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderagnostic(int[] arr, int target, int start, int end){
        // check if arr is dsc or asc?
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        }else {
            isAsc = false;
        }
        boolean isDsc;
        if (arr[start] > arr[end]) {
            isDsc = true;
        }else {
            isDsc = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            if(isDsc){
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
