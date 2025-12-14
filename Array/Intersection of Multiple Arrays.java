class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq = new int[1001];
        for(int[] number:nums) for(int num:number) freq[num]++;

        int len=nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<1001;i++) if(freq[i]==len) ans.add(i);
    
        return ans;
    }
}