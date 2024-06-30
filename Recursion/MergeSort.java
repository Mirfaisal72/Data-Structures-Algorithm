import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {8,4,9,6,2,1,3,5,7};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr; // This is the base condition
        }
        int mid = arr.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length ){ //checking if both the arrays are within the bound
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        //Now it may be that one of the arrays is not complete, than copy the remaining elements
        //one of the two conditions will be true

        while(i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
