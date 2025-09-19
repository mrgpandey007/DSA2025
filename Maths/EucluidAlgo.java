import java.util.Scanner;
public class EucluidAlgo {
    static int gcd(int n1,int n2) {
        if(n1==0) {
            return n2;
        } else if( n2==0 || n1==n2) {
            return n1;
        } 
        if (n1>n2) {
            return gcd(n1-n2, n2);
            
        } else {
            return gcd(n1, n2-n1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number 1\t:");
        int n1=input.nextInt();
        System.out.print("Enter Number 1\t:");
        int n2=input.nextInt();
        System.out.println("GCD is "+gcd(n1, n2));
        input.close();
    }
}
