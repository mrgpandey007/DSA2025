class InsertationSortRecursion {
    static void insertionSorting(int[] nums,int n) {
        if(n==nums.length) return;
        int i=nums[n];
        int j=n-1;
        while(j>=0 && i<nums[j]) {
            nums[j+1]=nums[j--];
        }
        nums[++j]=i;
        insertionSorting(nums,n+1);
    }
    public  static void insertionSort(int[] nums) {
        insertionSorting(nums,0);
    }
    public static void main(String[] args) {
	int[] nums= {3,4,5,1,2};
	for(int i:nums) {
	   System.out.print(i+" ");
	}
	System.out.println();
	insertionSort(nums);
	for(int i:nums) {
	   System.out.print(i+" ");
	}
	System.out.println();
    }
}