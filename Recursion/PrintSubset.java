import java.util.ArrayList;

public class PrintSubset {
    static void printSet(int[] arr, ArrayList<Integer> ans ,int i) {
        if(i==arr.length) {
            System.out.print(ans+" ");
            return;
        }
        ans.add(arr[i]);
        printSet(arr,ans,i+1);

        ans.remove(ans.size()-1);
        printSet(arr,ans,i+1);
    }
    public static void main(String[] args) {
        int[] ar={1,2,3};
        printSet(ar,new ArrayList<Integer>(),0);
    }
}
