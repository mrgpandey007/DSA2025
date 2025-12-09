class Solution {
    public int specialTriplets(int[] nums) {
        double count=0;
        long mod=1000000007;
        HashMap<Integer,Integer> leftcount=new HashMap<>(),rightcount=new HashMap<>();
        for(int i:nums) {
            rightcount.put(i,rightcount.getOrDefault(i,0)+1);
        }
        for(int num:nums) {
            rightcount.put(num,rightcount.get(num)-1);
            if(rightcount.get(num)==0) rightcount.remove(num);
            int left=leftcount.getOrDefault(num*2,0);
            int right=rightcount.getOrDefault(num*2,0);
            count=(count+(long)left*right)%mod;
            leftcount.put(num,leftcount.getOrDefault(num,0)+1);
        }
        return (int)count;
    }
}