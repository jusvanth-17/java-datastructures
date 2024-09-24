public class Bubblesort{
    public static void main(String args[]) {
        int a[] = {1,100,5,90,9};
        int n =a.length;
        Bubblesort1(a,n);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void Bubblesort1(int a[],int n) {
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
