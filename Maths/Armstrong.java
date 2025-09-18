import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n=input.nextInt();
        int sum=0,rem,org_num=n;
        while(n>0) {
            rem=n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if(org_num==sum) {
            System.out.println("It is a Arstrong number");
        } else {
            System.out.println("It is not a Armstrong number");
        }
        input.close();
    }
}