public class Sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0,6,7,8};
        boolean ans = check(arr,0);
        System.out.println(ans);
    }
    static boolean check(int[] arr,int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index +1] && check(arr,index+1);
    }
}
