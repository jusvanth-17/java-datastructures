import java.util.*;
class Duplicate {
    public static int  findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                return i;
            }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,3,4};
        System.out.println(findDuplicate(a));
    }
}