package Array;
public class Deletearray {
    public static void main(String[] args) {
        int arr[] = { 10, 50, 30, 40, 20 };
        int n=arr.length;
        int value =30;
        search(arr,value,n);
        delete(arr,n,value);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int search(int arr[],int value,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==value)
              return i;
        }
        return -1;
    }
    static int delete(int arr[],int n,int value)
    {
        int pos=search(arr,value,n);
        if(pos==-1)
        {
            System.out.println("element not found");
            return n;
        }
        for (int i = pos; i <n-1; i++) {
            arr[i]=arr[i+1];
            
        }
        return n-1;
    }
}
