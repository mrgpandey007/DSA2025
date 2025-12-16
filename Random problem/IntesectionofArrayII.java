class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return intersect(nums2,nums1);

        int[] freq= new int[1001];
        for (int i : nums2) freq[i]++;

        int[] ans=new int[nums1.length];
        int pos=0;
        for (int i : nums1)
            if(freq[i]!=0) {
                ans[pos++]=i;
                freq[i]--;
            }
        return Arrays.copyOf(ans,pos);
    }
}