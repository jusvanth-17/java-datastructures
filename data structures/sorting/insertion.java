class insertion {
    public static void main(String args[]) {
        int a[] = {1,100,5,90,900};
        int n = a.length;
        insertion1(a,n);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void insertion1(int a[],int n)
    {
        int i,j,key;
        for(j =1;j<n;j++)
        {
            key = a[j];
            i = j - 1;
            while(i>=0 && a[i]>key)
            {
                a[i+1] = a[i];
                i = i - 1;
            }
            a[i+1] = key;
        }
    }
}