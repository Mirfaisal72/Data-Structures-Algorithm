import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr1 = {2,3,56,4,10,343,65,34};
        int[] arr2 = {1,2,3,3,3,4,5,6,7,7,5};
        allcheck(arr2,3,0);
        System.out.println("The index of the target is: " + check(arr1,10,0));
        System.out.println("The indexes of repeating digits are: "+ list); //returning list

    }
    static int check(int[] arr, int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return check(arr,target,index + 1);
        }


    }
    static ArrayList<Integer> list = new ArrayList<>();
    static int allcheck(int[] arr,int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            list.add(index);
        }

            return allcheck(arr,target,index + 1);


    }
}
