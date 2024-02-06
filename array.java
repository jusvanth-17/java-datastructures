import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        int n, a[], sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[5];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];

        }
        System.out.print(sum);

    }
}
