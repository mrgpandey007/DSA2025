// User function Template for Java

class Solution {
    static int fib(int n) {
        if(n==0 || n==1) {
            return n;
        }
        int fab1=0;
        int fab2=1;
        int fab=0;
        for(int i=2;i<=n;i++) {
            fab=(fab1+fab2)%10;
            fab1=fab2;
            fab2=fab;
        }
        return fab;
    }
}