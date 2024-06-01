import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int ans = count(n,0);
        System.out.println("Number of zeros present are: "+ ans);
    }
    static int count(int num, int c){
        if(num == 0){ //Base condition
            return c;
        }
        int rem = num % 10;
        if(rem == 0){
            return count(num/10,c +1);
        }
        else{
            return count(num/10,c);
        }

    }
}
