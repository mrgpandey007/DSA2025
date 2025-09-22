public class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        Boolean prime[]=new Boolean[n];
        for(int i=2;i<n;i++) prime[i]= true;
        for(int i=2;i*i<n;i++) 
            if(prime[i]==true) 
                for(int j=i*i ; j<n ;j=j+i) prime[j]=false;
        int count=0;
        for(int i=2;i<n;i++) if(prime[i]==true) count++;
        return count;
    }
}