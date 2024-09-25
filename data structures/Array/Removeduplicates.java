import java.util.TreeSet;

class Removeduplicates {
    static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }

        return set.size();

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,3};
        int uniqueCount = removeDuplicates(nums);

        System.out.println("\n\nArray after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\nNumber of unique elements: " + uniqueCount);
    }
}