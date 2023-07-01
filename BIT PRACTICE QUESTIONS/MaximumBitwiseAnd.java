public class MaximumBitwiseAnd {
    public static int findMaxBitwiseAnd(int[] arr) {
        int maxBitwiseAnd = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int bitwiseAnd = arr[i] & arr[j];
                if (bitwiseAnd > maxBitwiseAnd) {
                    maxBitwiseAnd = bitwiseAnd;
                }
            }
        }

        return maxBitwiseAnd;
    }

    public static void main(String[] args) {
        int[] inputArr = {3, 5, 8, 10, 12};
        int result = findMaxBitwiseAnd(inputArr);
        System.out.println(result);
    }
}
