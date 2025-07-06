public class Simple
{
    public static void main(String[] args) {
        int[] arr={10,4,7,9,8,4,1,10,74,87,15,43,21,11,23,66,88,54,33,22};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum\t:"+max);
    }
}
