import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LCM a1=new LCM();
        int a=in.nextInt();
        int b=in.nextInt();

        int gcd=a1.findgcd(a,b);

        System.out.print(a1.findlcm(a,b));
    }
    public int findgcd(int a,int b){

        if(b==0){
            return a;
        }
        else{
            return findgcd(b,a%b);
        }
       
    }
    public int findlcm(int a,int b){
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Cannot calculate LCM for zero.");
        }
        return Math.abs((a*b))/findgcd(a, b);

    }
}
