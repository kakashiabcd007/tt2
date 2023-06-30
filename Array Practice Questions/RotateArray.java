public class RotateArray {

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int rotations = -3;
        int arr[] = { 10, 20, 30, 40, 50 };
        rotations = rotations % arr.length;
        if (rotations < 0) {
            rotations = arr.length + rotations;
        }
        reverse(arr, 0, arr.length - rotations - 1);
        reverse(arr, arr.length - rotations, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
