public class fabnocci {
    static int fab(int n) {
        if(n==0 || n==1) {
            return n;
        }
        int fab1=0;
        int fab2=1;
        int fab=0;
        for(int i=2;i<=n;i++) {
            fab=fab1+fab2;
            fab1=fab2;
            fab2=fab;
        }
        return fab%10;
    }
    public static void main(String[] args) {
        System.out.println("Fabnocci last term of 51 is\t:"+fab(51));
    }
}
