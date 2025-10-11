class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=Integer.MIN_VALUE;
        while(left<right) {
            int temp;
            if(height[left]>height[right]) {
                temp=height[right]*(right-left);
                right--;
            }else {
                temp=height[left]*(right-left);
                left++;
            }
            if(temp>area) area=temp;
        }
        return area;
    }
}