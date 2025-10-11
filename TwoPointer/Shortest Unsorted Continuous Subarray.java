class Solution {
    public static int min(int a,int b) {
        return a>b?b:a;
    }
    public static int max(int a,int b) {
        return a>b?a:b;
    }
    public int findUnsortedSubarray(int[] nums) {
        int size=nums.length,left=0,right=size-1;
        while(left < size-1 && (nums[left]<=nums[left+1])) left++;
        if(left==size-1) return 0;
        while(right > 0 && (nums[right]>=nums[right-1])) right--;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=left;i<=right;i++) {
            min=min(min,nums[i]);
            max=max(max,nums[i]);
        }
        while(left > 0 && nums[left-1] > min) left--;
        while(right<size-1 && nums[right+1] < max) right++;
        return right-left+1;
    }
}