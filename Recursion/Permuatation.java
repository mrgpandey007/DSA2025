class Solution {
    static void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void getpermutes(int[] nums,List<List<Integer>> answer,int i) {
        if(i==nums.length) {
        List<Integer> ans=new ArrayList<>();
            for(int k:nums) ans.add(k);
            answer.add(ans);
            return;
        }
        for(int j=i;j<nums.length;j++) {
            swap(nums,i,j);
            getpermutes(nums,answer,i+1);
            swap(nums,i,j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        getpermutes(nums,answer,0);
        return answer;
    }
}