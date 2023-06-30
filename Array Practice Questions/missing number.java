import java.util.Arrays;

class missingnumber {
    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5 };
        int missing = MissingNumber(array);
        System.out.println("Missing number: " + missing);
    }

    static int MissingNumber(int array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }
        return array.length + 1;
    }

}
