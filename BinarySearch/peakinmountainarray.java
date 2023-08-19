public class peakinmountainarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,70,4,3,2};
        int ans = peackindex(arr);
        System.out.println(ans);
    }

    public static int peackindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in the decreasing part of the array i.e on the right
                //it may be that the target lies on the left
                end = mid;
            } else {
                //you are in the increasing part of the array that is in the left and it is possible that the target lies on the right
                start = mid + 1;
            }
        }
        return start; // or end
    }
    
}

