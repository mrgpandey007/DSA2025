public class Find2ndMax
{
    public static void main(String[] args) {
        int[] arr={10,4,7,9,8,4,1,10,74,87,15,43,21,11,23,66,88,54,33,22};
    int max1=(arr[1]>arr[0]?arr[1]:arr[0]);
    int size=arr.length,max2=(max1==arr[0]?arr[1]:arr[0]);
    for(int i=2;i<size;i++)
    {
        if(arr[i]>max2)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else 
            {
                max2=arr[i];
            }
        }
    }
    System.out.println("2nd largest element\t:"+max2);
}
}