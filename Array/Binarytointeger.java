public class Binarytointeger {
    public static void main(String[] args) {
        int num=20;
        int bin=0;
        int pow=1;
        while(num>0)
        {
            bin+=pow*(num%2);
            num/=2;
            pow*=10;
        }
        System.out.println("Binary is "+bin);
    }
}
