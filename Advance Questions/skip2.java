public class skip2 {
    public static void main(String[] args) {
        String ans  = skip("Helloapple Faisal");
        System.out.println(ans);
    }
    static String skip(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
           return skip(up.substring(5));   //substring makes another string from index 1 and removes 0
        }
        else{
            return up.charAt(0) + skip(up.substring(1)); //here first that extra element will be printed and then function will be again called
        }
    }
}
