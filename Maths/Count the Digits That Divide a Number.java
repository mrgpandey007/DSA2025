class Solution {
    public int countDigits(int num) {
        int count=0,org_num=num;
        while(num>0){
            if(org_num%(num%10)==0) {
                count++;
            }
            num/=10;
        }
        return count;
    }
}