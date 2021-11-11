package geeksforgeeks.mathematics;

public class DivisiorOfNumber {
    public static void printDivisorOfNum (int n) {
        int i = 1;
        for (i = 1; i*i < n; i++) {
            if(n % i  == 0) {
                System.out.print(i + " ");
            }
        }

        for (; i >= 1; i--) {
            if(n % i  == 0) {
                System.out.print((n / i) + " ");
            }
        }
    }
}
