class Solution {
    public int arrayNesting(int[] nums) {
        int len=nums.length;
        int maxlen=0;
        
        for(int i=0;i<len;i++) {
            if(nums[i]==-1) continue;
            int count=0;
            int j=nums[i];
            while(nums[j]!=-1) {
                int k=nums[j];
                nums[j]=-1;
                count++;
                j=k;
            }
            maxlen=Math.max(maxlen,count);
            if(len==maxlen) return maxlen;
        }
        return maxlen;
    }
}