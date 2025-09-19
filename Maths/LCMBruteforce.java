import java.util.Scanner;
public class LCMBruteforce {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number 1\t:");
        int n1=input.nextInt();
        System.out.println("Enter Number 2\t:");
        int n2=input.nextInt();
        int max=n1>n2?n1:n2;
        int lcm=1;
        for(int i=max;i<=(n1*n2);i++)
            if(i%n1==0 && i%n2==0) {
                lcm=i;
                break;
            }
        System.out.println("LCM\t:"+lcm);
        input.close();
    }
}
