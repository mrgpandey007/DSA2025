class Solution {
    static int setBits(int n) {
        int count=0;
        while(n>0) {
            if(n%2!=0) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}