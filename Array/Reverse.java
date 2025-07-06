public class Reverse {
    public static void main(String[] args) {
        int[] arr={10,4,7,9,8,4,1,10,74,87,15,43,21,11,23,66,88,54,33,22};
        int temp,size=arr.length;
        for(int i=0;i<size/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
