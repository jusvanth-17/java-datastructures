public class Isalpha {
    public static void main(String[] args) {
        String s="abc10a";
        System.out.println(isAlpha(s));
    }
    public static int isAlpha(String s) {
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                 ans+=s.charAt(i) ;
            }
        }
        return ans.length(); 
}
}
