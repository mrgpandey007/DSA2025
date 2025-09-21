class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        StringBuilder hex= new StringBuilder();
        int rem;
        while(num!=0) {
            rem=num&15;
            num>>>=4;
            if(rem < 10) {
                hex.insert(0,rem);
            } else {
                hex.insert(0,(char)(87+rem));
            }
        }
        return hex.toString();
    } 
}