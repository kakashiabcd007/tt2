
public class sum2 {

    static void sum(int num, double result) {

        if (num == 0) {
            return;
        }
        double subResult = (double) num / (Math.pow(num, num));
        result += subResult;
        sum(num - 1, result);

    }

    static void fourth(int num) {
        sum(num, 0);
    }

    static double sum(int num) {
        if (num == 1) {
            return (double) num;
        }

        double subResult = (double) num / (Math.pow(num, num));
        double result = subResult + sum(num - 1);
        return result;
    }

    public static void main(String[] args) {
        sum(3);
        System.out.println("Sum is: " + sum(3));
    }
}