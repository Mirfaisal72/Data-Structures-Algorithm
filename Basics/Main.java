import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 75;
        arr[3] = 65;
        arr[4] = 78;
        System.out.println(arr[3]);

     //   for (int i = 0; i < arr.length; i++) {  //arr.length is defined as length of the array

       // }
      //  for(int i = 0; i < arr.length; i++){
            //arr[i]= in.nextInt();
           // System.out.print(arr[i] + " ");
        //}
        //for(int num: arr) {   //for every element in array, print the element
         //   System.out.print(num + " "); //here num represents element of the array
        //}
        String[] str = new String[4];
        for(int i =0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
