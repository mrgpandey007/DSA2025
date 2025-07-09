class Solution {
    public static int countSetBits(int n) {
        // code here
        if(n==0 ||n==1) {
            return n;
        }
        int x=lgpow(n);
        int y=x*(1<<(x-1));
        int z=n-(1<<x);
        return y+z+1+countSetBits(z);
    }
    public static int lgpow(int n) {
        int p=0;
        while(n>0) {
            n=n>>1;
            p++;
        }
        return p-1;
    }
}