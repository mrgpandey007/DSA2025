class Solution {
    public int countTriples(int n) {
        if(n<5) return 0;
        int count=0,j;
        for(int i=1;i<=n;i++) {
            j=i+1;
            while(i*i+j*j <= n*n) {
                for(int k=j+1;k<=n;k++) {
                    if(i*i+j*j==k*k) {
                        count+=2;
                        break;
                    }
                }
                j++;
            }
        }
        return count;
    }
}