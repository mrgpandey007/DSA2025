public class ArrayPalindrome
{
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,6,5,4,3,2,1};
        int size=ar.length;
        boolean ispalindrome=true;
        for(int i=0;i<size/2;i++)
        {
            if(ar[i]!=ar[size-(i+1)])
            {
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome)
        {
            System.out.println("Array is Palindrome");
        }
        else
        {
            System.out.println("Array is not palindrome");
        }
    }
}