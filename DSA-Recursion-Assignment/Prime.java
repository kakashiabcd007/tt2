public class Prime {
    static void prime(int num , int counter){
        if(counter == num){
            System.out.println(""+num+" is a prime number");
            return;
        }

        if(num % counter == 0){
            System.out.println(""+num+" is not a prime number");
            return;
        }

        prime(num, counter + 1);
    }

    static boolean primeNum(int num , int counter){
        if(counter == 2){
            return num % counter == 0;
        }

        boolean result = primeNum(num, counter - 1);
        if(result){
            return result;
        }
        return num % counter == 0;
    }


    static void prime(int num){
        prime(num , 2);
    }


    static boolean primeNum(int num){
        return primeNum( num , num - 1);
    }

    public static void main(String[] args) {
        prime(42);  
    }
}