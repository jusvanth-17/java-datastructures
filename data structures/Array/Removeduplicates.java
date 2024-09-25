class  Removeduplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; 
        }

        int j = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; 
               j++;
            }
        }

        return j; // Return the number of unique elements
    }

    // Main method to test the removeDuplicates function
    public static void main(String[] args) {

        // Example input array
        int[] nums = {1, 1, 2, 3, 4, 4, 5, 6, 6};

        // Print original array
        System.out.println("Original Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Call the removeDuplicates method
        int uniqueCount = removeDuplicates(nums);

        System.out.println("\n\nArray after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }

        // Print the count of unique elements
        System.out.println("\n\nNumber of unique elements: " + uniqueCount);
    }
}