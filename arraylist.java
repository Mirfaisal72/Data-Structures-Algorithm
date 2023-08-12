import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      Scanner in = new Scanner(System.in);
    /*    list.add(45);
        list.add(95);
        list.add(25);
        list.add(445);
        list.add(85);
        list.add(499);
        list.add(450);
        System.out.println(list);*/
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
