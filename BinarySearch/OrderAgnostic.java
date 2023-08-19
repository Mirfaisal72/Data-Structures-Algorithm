import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        Scanner ess = new Scanner(System.in);
        System.out.println("Enter The Number You Want To Search: ");
        int target = ess.nextInt();
        int ans = OrderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
