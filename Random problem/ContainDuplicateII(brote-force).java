class Solution {
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length, j = 0;
        for (int i = 0; i < len; i++) {
            j = i + 1;
            while (j < len && abs(i - j) <= k) {
                if (nums[i] == nums[j])
                    return true;
                j++;
            }
        }
        return false;
    }
}