class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n=input.nextInt();
        if(n<4) {
            System.out.println(n);
            input.close();
            return;
        } 
        int s1=1,s2=2,s=s1+s2;
        for(int i=3;i<=n ; i++) {
            s=s1+s2;
            s1=s2;
            s2=s;
        }
        System.out.println(s);
        input.close();
    }
}
