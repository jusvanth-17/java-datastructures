package Array;
public class Searcharray {
    

    static int found(int arr[],int k)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k)
               return i;
     }
     return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=4;
        int ans=found(arr,k);
        System.out.println("Array element found in position :"+ans+" Element is :"+arr[ans]);
        
    }
}
