class intersectionarray {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int intsec[]=new int[n];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    intsec[index++]=nums1[i];
                     nums2[j] = Integer.MIN_VALUE;
                     break;
                }
            }
        }
      return java.util.Arrays.copyOfRange(intsec, 0, index);

    }
}