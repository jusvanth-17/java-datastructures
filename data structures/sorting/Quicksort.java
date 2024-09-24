import java.util.*;
class Quicksort1{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Quicksort(a,0,n-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    static void Quicksort(int a[],int start,int end)
    {
        if(start<end)
        {
            int pi=partition(a,start,end);
            Quicksort(a,start,pi-1);
            Quicksort(a,pi+1,end);
        }
    }
    static void swap(int a[],int pi,int end)
    {
        int temp=a[pi];
        a[pi]=a[end];
        a[end]=temp;
    }
    static int partition(int a[],int start,int end)
    {
        int pivot=a[end];
        int pi=start-1;
        for(int i=start;i<end;i++)
        {
            if(a[i]<pivot)
            {
                ++pi;
                swap(a,i,pi);
            }
        }
        ++pi;
        swap(a,pi,end);
        return pi;
    }
}