package geeksforgeeks.mathematics;

public class PrimeNumber {
    public static boolean isPrimeNumber (int num) {
        if(num == 1 || num == 2 || num == 3 ){
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= num; i = i + 6) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
