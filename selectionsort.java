import javax.management.remote.rmi._RMIConnection_Stub;

public class selectionsort {
     public static void main(String args[]){
         int a[] = {1,100,5,90,9};
         int n = a.length;
         selectionsort1(a,n);
         for(int i:a)
         {
             System.out.print(i+" ");
         }
     }
     static void selectionsort1(int a[],int n)

    {
        int min_index;
        for(int i=0;i<n;i++)
        {
            min_index=i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[min_index])
                {
                    min_index=j;
                }
                int temp=a[min_index];
                a[min_index]=a[i];
                a[i]=temp;
            }
        }
     }
 }
