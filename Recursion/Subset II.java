class Solution {
    public static void ret_subset(List<List<Integer>> answer,ArrayList<Integer> ans,int[] nums,int i) {
        if(i==nums.length) {
            answer.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        ret_subset(answer,ans,nums,i+1);
        ans.remove(ans.size()-1);
        int p=i+1;
        while(p<nums.length && nums[i]==nums[p]) {
            p++;
        }
        ret_subset(answer,ans,nums,p);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer=new ArrayList<>();
        ret_subset(answer,new ArrayList<Integer>(),nums,0);
        return answer;
    }
}