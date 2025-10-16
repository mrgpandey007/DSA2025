class Solution {
    public int trailingZeroes(int n) {
        int count=0,div=5;
        while(n>=div) {
            count+=n/div;
            div*=5;
        }
        return count;
    }
}