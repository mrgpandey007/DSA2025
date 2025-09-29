class Mulstring {
    public static String multiply(String num1, String num2) {
        if(num1=="0" || num2=="0") return "0";
        if(num1=="1") return num2;
        if(num2=="1") return num1;
        int i=num1.length()-1,j=num2.length()-1;
        long sum=0;
        while(j>=0) {
            int mul=0;
            for(int k=j;k>=0;i--) {
                mul+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
            sum=sum*10+mul;
            j--;
        }
        StringBuilder ans=new StringBuilder();
        while(sum!=0) {
            ans.append(sum%10);
            sum/=10;
        } 
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s1="1234";
        String s2="5678";
        System.out.println(multiply(s1,s2));
    }
}