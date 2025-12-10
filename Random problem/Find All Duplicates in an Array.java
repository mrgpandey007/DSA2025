class Solution {
    public static int abs(int x) {
        return x>0?x:-x;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        System.gc();
        for(int i:nums) {
            int x=abs(i)-1;
            if(nums[x]<0) result.add(x+1);
            nums[x]*=-1;
        }
        return result;
    }
}