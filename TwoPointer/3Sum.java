class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        if(nums[len-1]<0) return ans;
        for(int i=0;i<len-1;i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int left=i+1,right=len-1;
            while(left<right) {
                int sum=nums[left]+nums[right];
                if(sum>-nums[i]) right--;
                else if(sum<-nums[i]) left++;
                else {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                }
            }
        }
        return ans;
    }
}