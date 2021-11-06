package geeksforgeeks.mathematics;

import java.time.LocalTime;

public class Mathematics {
    public static void main(String ...args) {
        System.out.println("Number of digits of the number 764647223 is " + FindDigit.numberOfDigit(764647223));
        System.out.println("Palidrome of 100001 is " + Palindrome.isPalindromeNumber(100001));
        System.out.println("Factorials of 100 is " + Factorials.findFact(10));
        System.out.println("Factorials of 5 using recursion is " + Factorials.findFactorialsRecrusion(10));
        System.out.println("Trailing no of zeros in factorials of 100 is " + new TrailingZerosOfFactorials().findTailingZeroOfFact(10));
    }
}
