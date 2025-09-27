class Main {
    public static int divide(int dividend, int divisor) {
        boolean flag=(dividend>=0)==(divisor>=0);
        long num=dividend,dem=divisor,ans=0;
        if(num<0) num=-num;
        if(dem<0) dem=-dem;
        while(num>=dem) {
            long bit=1;
            while(dem*bit <= num) bit=bit<<1;
            bit=bit>>1;
            num-=dem*bit;
            ans+=bit;
        }
        if(ans>Integer.MAX_VALUE && flag==true) return Integer.MAX_VALUE;
        if(ans>Integer.MAX_VALUE && flag==false) return Integer.MIN_VALUE;
        return flag?(int)ans:-(int)ans;
    }
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        int n=input.nextInt();
        int d=input.nextInt();
        System.out.println(divide(n,d));
        input.close();
    }
}