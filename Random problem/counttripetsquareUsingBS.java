class Solution {
    public int countTriples(int n) {
        if(n<5) return 0;
        int count=0;
        for(int i=n;i>4;i--) {
            int left=3,right=n-1;
            while(left<right) {
                if(left*left + right*right == i*i) count+=2;
                if(left*left + right*right > i*i) {
                    right--;
                } else {
                    left++;
                } 
            }
        }
        return count;
    }
}