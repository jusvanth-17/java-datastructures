import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Reading the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reading the check value
        System.out.print("Check: ");
        int check = sc.nextInt();

        int count = 0;

        // Calculating sum of pairs
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(arr[i]+" "+arr[j] );
                int sum = arr[i] + arr[j];
                if (sum < check) {
                    count++;
                }
            }
        }

        // Printing the result
        System.out.println(count);
        
        sc.close();
    }
}