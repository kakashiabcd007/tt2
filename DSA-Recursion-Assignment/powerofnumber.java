class powerofnumber {
    static int power(int num1, int num2) {
        if (num2 == 0)
            return 1;
        else
            return num1 * power(num1, num2 - 1);

    }
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        System.out.println(power(num1, num2));
    }
}
