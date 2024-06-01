public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,9,20,36};
        int target = 36;
        int ans = BS(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
  static int BS(int [] arr, int target, int s, int e ){
      if (s > e) {
        return -1;
      }
      int m = s + (e - s) / 2;
      if (arr[m] == target) {
          return m;
      }
      if (arr[m] > target) {
          return BS(arr,target,s,m-1);
      }

      return BS(arr,target,m + 1, e);
    }

}

