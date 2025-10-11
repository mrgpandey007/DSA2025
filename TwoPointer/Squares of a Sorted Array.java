class Solution {
    public int abs(int x) {
        if(x>0) return x;
        return -x;
    }
    public int sq(int x) {
        return x*x;
    }
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int[] sortsq=new int[len];
        int left=0,right=len-1;
        for(int i=len-1;i>=0;i--) {
            if(abs(nums[left])>abs(nums[right])) sortsq[i]=sq(nums[left++]);
            else sortsq[i]=sq(nums[right--]);
        }
        return sortsq;
    }
}