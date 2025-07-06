public class Integertobinary {
    public static void main(String[] args) {
        int bin=100100;
        int num=0;
        int pow=1;
        while(bin>0)
        {
            num+=pow*(bin%10);
            pow*=2;
            bin/=10;
        }
        System.out.println("Number =="+ num);
    }
}
