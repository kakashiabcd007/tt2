public class sum {

    static void sumN(int n, int result) {
        if (n == 0) {
            return;
        }

        result = result + n;
        sumN(n - 1, result);
    }

    static void sumN(int n) {
        sumN(n, 0);
    }

    static int sum_Nums(int n) {
        if (n == 0) {
            return n;
        }

        return n + sum_Nums(n - 1);
    }

    public static void main(String[] args) {
        sumN(5);
        System.out.println("Sum of n naturals no. is" + sum_Nums(5));
    }
}
