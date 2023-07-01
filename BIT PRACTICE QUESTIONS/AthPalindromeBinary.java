public class AthPalindromeBinary {
    public int findAthPalindromeBinary(int A) {
        int count = 0;
        int num = 0;

        while (count < A) {
            String binary = Integer.toBinaryString(num);
            if (isPalindrome(binary)) {
                count++;
            }
            num++;
        }

        return num - 1;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        AthPalindromeBinary solution = new AthPalindromeBinary();
        int A = 10;
        int result = solution.findAthPalindromeBinary(A);
        System.out.println(result);  
    }
}
