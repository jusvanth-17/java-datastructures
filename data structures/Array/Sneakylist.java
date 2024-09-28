import java.util.*;
class sneakyList {
    public int[] getSneakyNumbers(int[] nums) {
        
        List<Integer> sneakyList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            int cnt = 0;

            // Check for duplicates
            for (int j = 0; j < nums.length; j++) {
                if (target == nums[j]) {
                    cnt++;
                }
            }
            
            // Add to sneakyList if it's a duplicate and not already added
            if (cnt > 1 && !sneakyList.contains(target)) {
                sneakyList.add(target);
            }
        }

        // Convert the List to an array
        int[] arr = new int[sneakyList.size()];
        for (int i = 0; i < sneakyList.size(); i++) {
            arr[i] = sneakyList.get(i);
        }

        return arr;
    }
}