import java.util.Scanner;
public class GCDBruteforce {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number 1\t:");
        int n1=input.nextInt();
        System.out.println("Enter Number 2\t:");
        int n2=input.nextInt();
        if(n1==0) System.out.println("GCD\t:"+n2);
        else if (n2==0 || n1==n2) System.out.println("GCD\t:"+n1);
        int min= n1>n2?n2:n1,gcd=1;
        for( int i=1 ; i < min ; i++ ) {
            if(n1%i==0 && n2%i==0) {
                gcd=i;
            }
        }
        System.out.println("GCD\t:"+gcd);
        input.close();
    }
}
