public class SumofNnumber {
    static int sumn(int n) {
        if(n==0) {
            return 0;
        }
        return n+sumn(n-1);
    }
    public static void main(String[] args) {
        System.out.println("SUM of 5 Number\t:"+sumn(5));
    }
}
