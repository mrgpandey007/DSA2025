public class Issorted
{
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,4,7,8,9,10};
        boolean isincre=true;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                isincre=false;
                break;
            }
        }
        if(isincre)
        {
            System.out.println("Yes array is in increasing order");
        }
        else
        {
            System.out.println("NO,Elements of an array is not in incresing order");
        }
    }
}
