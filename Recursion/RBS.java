public class RBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int ans = check(arr,4,0,arr.length-1);
        System.out.println("The target is at index no. : " + ans);
    }
    static int check(int[] arr, int target , int s ,int e ){
        if (s>e){
            return -1;
        }
        int mid = s + (e -s)/2;
        if(target ==arr[mid]){
            return mid;
        }
        if(arr[s] < arr[mid]){
            if(target>=arr[s] && target <= arr[mid]){
                return check(arr,target,s,mid-1);
            }
        }
            return check(arr,target,mid+1,e);
    }
}
