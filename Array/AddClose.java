import java.util.Arrays;
public class AddClose
{
    public static 
    int add1(int[] arr,int target)
    {
        int size=arr.length;
        int low,high;
        int sum,diff=0,mindiff=Integer.MAX_VALUE,temp=0;
        for(int i=0;i<size-2;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            low=i+1;
            high=size-1;
            while(low<high)
            {
                sum=arr[i]+arr[low]+arr[high];
                if(sum==target)
                {
                    return sum;
                }
                else if(sum<target) low++;
                else
                {
                    high--;
                }
                diff=Math.abs(sum-target);
                if(diff<mindiff)
                {
                    mindiff=diff;
                    temp=sum;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,0};
        Arrays.sort(arr);
        int target=-100;
        System.out.println(add1(arr,target));
    }
}
