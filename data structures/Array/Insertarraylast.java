
public class Insertarraylast {

	static int insertSorted(int arr[], int n, int key,
							int capacity)
	{

		// Cannot insert more elements if n
		// is already more than or equal to
		// capacity
		if (n >= capacity)
			return n;

		arr[n] = key;

		return (n + 1);
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = new int[20];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		int capacity = 20;
		int n = 6;
		int i, key = 26;

		System.out.print("Before Insertion: ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		// Inserting key
		n = insertSorted(arr, n, key, capacity);

		System.out.print("\n After Insertion: ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
