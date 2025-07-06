public class FindFrequency
{
    public static int count(int[] arr,int elements)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==elements)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={10,4,10,7,10,9,10,4,8,4,4,5,10,4,3,10};
        int[] temp=new int[2*arr.length];
        int tempsize=2;
        temp[0]=arr[0];
        temp[1]=count(arr, arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            boolean signal=false;
            for(int j=0;j<tempsize;j+=2)
            {
                if(arr[i]==temp[j])
                {
                    signal=true;
                    break;
                }
            }
            if(signal==false)
            {
                tempsize+=2;
                temp[tempsize-2]=arr[i];
                temp[tempsize-1]=count(arr,arr[i]);
            }
        }
        for(int i=0;i<tempsize;i+=2)
        {
            System.out.println("Frenquency of "+ temp[i]+" = "+temp[i+1]);
        }
    }
}
