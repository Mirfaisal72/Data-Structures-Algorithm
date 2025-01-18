import java.util.ArrayList;

public class phonepadArray {
    public static void main(String[] args) {
        ArrayList<String> ans = pad("","123");
        System.out.println(ans);
    }
    static ArrayList<String> pad(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }

        int digit = up.charAt(0) - '0';  //this will convert '2' to 2.
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch =  (char) ('a' + i);
            list.addAll(pad(p+ ch,up.substring(1)));
        }
        return list;     //here the function is finished processing and goes back up
    }
}
