import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
         int[][] arr = new int[3][3];

         for(int row =0; row < 3; row++ ){
             // now for each colon
          for(int col = 0; col < arr[row].length; col++){
              arr[row][col] =in.nextInt();
              System.out.print(arr[row][col] + " ");
          }
             System.out.println();
         }
         //after printing a row we need to add a new line to make it like a matrix
    }
}
