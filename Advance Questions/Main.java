public class Main {
    public static void main(String[] args) {
        skip("","baccdah");
    }
    static void skip(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p,up.substring(1));   //substring makes another string from index 1 and removes 0
        }
        else{
            skip(p + ch,up.substring(1));
        }
    }
  /*  static String skip(String up){
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
        return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }*/
}