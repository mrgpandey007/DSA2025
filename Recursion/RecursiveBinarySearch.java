public class RecursiveBinarySearch {
    static int binarySearch(int[] arr,int low,int high,int key) {
        int mid=high-(high-low)/2;
        if(arr[mid]==key) {
            return mid;
        }
        else if(arr[mid]>key) {
            return binarySearch(arr, low, mid-1, key);
        }
        else if(arr[mid]<key) {
            return binarySearch(arr, mid+1, high, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar={-1,3,5,7,9,11,13,15,17,19};
        int key=15;
        int pos=binarySearch(ar, 0, ar.length, key);
        if(pos==-1) {
            System.out.println(key+" No Found in the arr");
        } else {
            System.out.println(key+" Found at Position\t"+pos+1);
        }
    }
}
