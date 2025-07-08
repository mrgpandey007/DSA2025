class Solution {
    public static int countBitsFlip(int a, int b) {
        int xor=a^b;
        int n=0;
        while(xor>0) {
            n+=(xor&1);
            xor>>=1;
        }
        return n;
    }
}
