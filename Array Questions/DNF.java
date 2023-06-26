class DNF {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 0, 0, 1, 1 };
        sortColors(arr);
    }

    public static void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            int value = arr[mid];
            switch (value) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
