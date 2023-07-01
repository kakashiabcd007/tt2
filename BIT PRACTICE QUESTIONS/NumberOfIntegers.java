public class NumberOfIntegers {
    public static int countIntegers(int n) {
        int count = 0;
        
        for(int i=0;i<=n;i++){
            if((n&i)==i){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countIntegers(n);
        System.out.println(result);
    }
}
