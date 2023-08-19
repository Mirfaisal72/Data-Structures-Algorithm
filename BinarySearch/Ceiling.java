import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args){
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89}; //Ascending Order
        Scanner ess = new Scanner(System.in);
        System.out.println("Enter The Number You Want To Search: ");
        int target = ess.nextInt();
        int ans = Binarysearch(arr, target);
        System.out.println(ans);

    }
    static int Binarysearch(int[] arr, int target) {
        //but what if the target element is greater than the greatest number is the array i.e the last number
        if (target >= arr[arr.length -1 ]) {
        return -1;
        }

        int start = 0;
        int end = arr.length - 1;
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
        return start;
    }
}