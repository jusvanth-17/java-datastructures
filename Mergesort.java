import java.util.*;
public class Mergesort {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[] = {9, 20, 30, 1, 50, 60};
        merger(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    static void merger(int a[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            merger(a, start, mid);
            merger(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    static void merge(int a[], int start, int mid, int end) {
        int ls = mid - start + 1;
        int rs = end - mid;
        int la[] = new int[ls];
        int ra[] = new int[rs];
        for (int i = 0; i < ls; i++) {
            la[i] = a[i + start];
        }
        for (int j = 0; j < rs; j++) {
            ra[j] = a[mid + 1 + j];
        }
        int i = 0, k = start, j = 0;
        while (i < ls && j < rs) {
            if (la[j] < ra[j]) {
                a[k++] = la[i++];
            } else {
                a[k++] = ra[j++];
            }
        }
        while (i < ls) {
            a[k++] = la[i++];
        }
        while (j < rs) {
            a[k++] = ra[j++];
        }
    }
}