public class Median {
    public static void main(String[] args) {
        int[] nums1 = { 1, 4, 8 };
        int[] nums2 = { 5, 6 ,10};
        int size1 = nums1.length;
        int size2 = nums2.length;
        int size = size1 + size2;
        int[] temp = new int[size];
        int i=0,j=0,k = 0;//nums1
        while ((i<size1) && (j<size2)) {
            if (nums1[i] > nums2[j]) {
                temp[k++] = nums2[j++];
            } else {
                temp[k++] = nums1[i++];
            }
        }
        while (i < size1) {
            temp[k++] = nums1[i++];
        }
        while (j < size2) {
            temp[k++] = nums2[j++];
        }
        for (int x : temp) {
            System.out.println(x);
        }
        int mid = size / 2;
        System.out.println("mid ="+mid);
        double v = (size % 2 == 0 ? (temp[mid - 1] + temp[mid]) / 2 : temp[mid]);
        System.out.println(v);
    }
}
