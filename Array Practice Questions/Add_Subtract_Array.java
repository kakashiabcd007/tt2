public class Add_Subtract_Array {
    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 5 };
        int[] second = { 6, 7, 8, 9, 9 };
        int[] resultArray = new int[first.length];

        // Addition
        for (int i = 0; i < first.length; i++) {
            resultArray[i] = first[i] + second[i];
        }

        System.out.println("Addition of arrays:");
        for (int n : resultArray) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Subtraction
        int carry = 0;

        for (int i = first.length - 1; i >= 0; i--) {
            int difference = first[i] - second[i] - carry;

            if (difference < 0) {
                difference += 10;
                carry = 1;
            } else {
                carry = 0;
            }

            resultArray[i] = difference;
        }

        System.out.println("Subtraction is:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
