public class differenceBetween {
    public static void main(String[] args) {
        int[] ar1 = { 1, 2, 3, 4, 5, 6 };
        int[] ar2 = { 4, 5, 6, 7, 8, 9 };
        int size1 = ar1.length;
        int size2 = ar2.length;
        boolean common = true;
        System.out.println("A-B ");
        for (int i = 0; i < size1; i++) {
            common = false;
            for (int j = 0; j < size2; j++) {
                if(ar1[i]==ar2[j])
                {
                    common=true;
                    break;
                }
            }
            if(!common)
            {
                System.out.print(ar1[i]+"  ");
            }
        }
        System.out.println("\nB-A");
        for (int i = 0; i < size2; i++) {
            common = false;
            for (int j = 0; j < size1; j++) {
                if(ar2[i]==ar1[j])
                {
                    common=true;
                    break;
                }
            }
            if(!common)
            {
                System.out.print(ar2[i]+"  ");
            }
        }
    }
}
