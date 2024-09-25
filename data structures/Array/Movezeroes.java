class Movezeroes {
    public void moveZeroes(int[] nums) {
        int j = 0; // Pointer to track the next position for a non-zero element

        // Single pass to move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at index j
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++; // Move j forward for the next non-zero element
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input array
        int[] nums = {0, 1, 0, 3, 12};

        // Print original array
        System.out.println("Original Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Call the moveZeroes method
        solution.moveZeroes(nums);

        // Print the array after moving zeroes
        System.out.println("\n\nArray after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}