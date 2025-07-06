public class Sumofarray {
    public static void main(String[] args) {
        int[] arr={10,4,7,9,8,4,1,10,74,87,15,43,21,11,23,66,88,54,33,22};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of array of element\t:"+sum);
    }
}