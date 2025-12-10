class Solution {
    public int countPermutations(int[] complexity) {
        int len = complexity.length;
        for (int i = 1; i < len; i++) {
            if (complexity[i] <= complexity[0])
                return 0;
        }
        long fact = 1;
        for (int i = 2; i < len; i++) {
            fact = (fact * i) % 1000000007;
        }
        return (int) fact;
    }
}