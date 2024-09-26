import java.util.*;
public class Insertelementatanyposition {

    static void insertatany(int arr[],int n,int pos,int value)
    {
        for (int i = n-1; i >=pos; i--) {
            arr[i+1]=arr[i];
        }
        arr[pos]=value;
    }
    public static void main(String[] args) {
        int arr[]=new int[15];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int n = 5;
        int pos=1;
        int value=31;
        insertatany(arr,n,pos,value); 
        n+=1;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}
