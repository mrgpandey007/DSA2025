class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int size=nums.length,n=0,ans=0;
        long prod=1;
        for(int i=0;i<size;i++) {
            prod*=nums[i];
            while(prod>=k) prod/=nums[n++];
            ans+=(1+i-n);
        }
        return ans;
    }
}