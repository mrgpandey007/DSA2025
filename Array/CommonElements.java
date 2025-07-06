public class CommonElements {
    public static void main(String[] args) {
        int[] ar1 = { 1, 2, 4, 5, 6, 7, 10, 15 };
        int[] ar2 = { 1, 2, 3, 7, 8, 0, 8, 63, 3 };
        int size1 = ar1.length;
        int size2 = ar2.length;
        boolean iscommon = true;
        System.out.println("Common elements are ");
        for (int i = 0; i < size1; i++) {
            iscommon = false;
            for (int j = 0; j < size2; j++) {
                if (ar1[i] == ar2[j]) {
                    iscommon = true;
                    break;
                }
            }
            if (iscommon) {
                System.out.print(ar1[i] + "  ");
            }
        }
    }
}