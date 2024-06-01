public class main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int ans = BS(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int BS(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start )/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
            return BS(arr,target,start, mid -1);
        }
        else{
            return BS(arr,target,mid + 1,end);
        }

    }
}
