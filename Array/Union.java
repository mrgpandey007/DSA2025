public class Union {
    public static void main(String[] args) {
        int[] ar1={1,2,4,5,6,7,10,15};
        int[] ar2={1,2,3,7,8,0,63};
        int size1=ar1.length;
        int size2=ar2.length;
        boolean iscommon=true;
        System.out.println("Union elements are ");
        for(int i=0;i<size1;i++)
        {
            System.out.print(ar1[i]+"  ");
        }
        for(int i=0;i<size2;i++)
        {
            iscommon=false;
            for(int j=0;j<size1;j++)
            {
                if(ar2[i]==ar1[j])
                {
                    iscommon=true;
                    break;
                }
            }
            if(!iscommon)
            {
                System.out.print(ar2[i]+"  ");
            }
        }
    }
}