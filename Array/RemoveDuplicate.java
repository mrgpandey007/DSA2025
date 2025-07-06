public class RemoveDuplicate
{
    public static void main(String[] args) {
        int[] arr={10,4,10,7,10,9,10,4,8,4,4,5,10,4,3,10};
        int count,size=arr.length;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        int pos;
        for(int i=0;i<size-1;i++)
        {
            pos=i+1;
            count=0;
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else
                {
                    arr[pos]=arr[pos+count];
                    pos++;
                }
            }
            size-=count;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}