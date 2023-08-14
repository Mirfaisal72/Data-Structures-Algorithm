import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 2, 3, 4},
                {76, 54, 98},
                {66, 99, 34, 17},
                {9, 8, 7,}
        };
        int target = 7;
        int[] ans =Search( arr2d,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search( int[][] arr2d,int target){
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col <arr2d[row].length ; col++) {
               if(arr2d[row][col] == target){
                   return new int[]{row,col};
               }
            }

        }
        return new int[]{-1,-1};
    }
}

