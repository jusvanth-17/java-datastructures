import java.util.Scanner;

public class balloon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // int n=in.nextInt();
        int n=4;
        // int cost=in.nextInt();
        int cost=8;
        // int packet[]=new int[n];
        int packet[]={1 ,2, 6, 7};

        // int cost1[]=new int[n];
        int cost1[]={5 ,3, 4, 4};

        // for (int i = 0; i < cost1.length; i++) {
        //     packet[i]=in.nextInt();
        // }
        // for (int i = 0; i < cost1.length; i++) {
        //     cost1[i]=in.nextInt();

        // }
        int sum=0,max=Integer.MIN_VALUE;
        for (int i = 0; i < cost1.length; i++) {
            for (int k = i+1; k < cost1.length; k++) {
                if(cost1[i]+cost1[k]==cost)
                {
                    sum=packet[i]+packet[k];
                    if(max<sum) max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
