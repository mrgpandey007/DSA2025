class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result=new HashSet<>();
        Set<Integer> count= new HashSet<>();

        for(int i:nums1) {
            if(!count.contains(i))
            count.add(i);
        }

        for(int i:nums2) {
            if(count.contains(i)) {
                count.remove(i);
                result.add(i);
            }
        }
        
        count.clear();
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}