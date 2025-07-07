class Solution {
    public int[] singleNum(int[] arr) {
        int n=0;
        for(int i=0;i<arr.length;i++) {
            n^=arr[i];
        }
        int ni = n & -n;
        int n1=0,n2=0;
        for(int i=0;i<arr.length;i++) {
            if((arr[i]&ni)==0) {
                n1^=arr[i];
            }
            else {
                n2^=arr[i];
            }
        }
        if(n1>n2) {
            return new int[]{n2,n1};
        }
        return new int[]{n1,n2};
    }
}