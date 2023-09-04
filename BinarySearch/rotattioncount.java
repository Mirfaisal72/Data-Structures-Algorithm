public class rotattioncount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("The array is rotated" + " " +countrotations(arr) +" " +  "times.");
    }

   static int countrotations(int [] arr){
        int pivot = RBS(arr);
        return pivot + 1;
   }
    static int RBS(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //here 4 cases are used
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
