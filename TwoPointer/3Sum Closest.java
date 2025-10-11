class Solution {
    public static int abs(int a) {
        if(a>0) return a;
        return -a;
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length,sum=0,mindiff=Integer.MAX_VALUE,diff=0,temp=0;
        for(int i=0;i<len-2;i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left=i+1,right=len-1;
            while(left<right) {
                sum=nums[i]+nums[left]+nums[right];
                if(sum<target) {
                    while(left<right && nums[left]==nums[left+1]) left++;
                    left++;
                } else if(sum>target) {
                    while(left<right && nums[right]==nums[right-1]) right--;
                    right--;
                } else return target;
                diff=abs(sum-target);
                if(mindiff>diff) {
                    mindiff=diff;
                    temp=sum;
                }
            }
        }
        return temp;
    }
}