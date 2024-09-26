public class Magical {
    public static void main(String[] args) {
       int a[][]={{1,2,3,},{4,5,6},{7,8,9}};
       int count=0;
       for (int i = 0; i < a.length; i++) {
           int sum=0;
           for (int j = 0; j < a.length; j++) {
                if(a[i][j]%2!=0){
                     sum+=a[i][j];
                     
                }
           }
           if(sum%2==0){
            count++;
           }
       }
       System.out.println(count);
    }
}
