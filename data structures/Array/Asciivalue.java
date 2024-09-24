
import java.util.*;
public class Asciivalue {
         public static void main(String[] args) {  
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String j=String.valueOf(n);

        for(int i=0;i<=j.length();i+=2){
           if(i+2<=j.length()){
            System.out.println(j.substring(i,i+2)+"-"+(char)Integer.parseInt(j.substring(i,i+2)));
           }
           else break;
        }
    }
}
