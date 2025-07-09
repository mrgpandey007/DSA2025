package Recursion;

class factorial {
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5\t:" + fact(5));
    }
}