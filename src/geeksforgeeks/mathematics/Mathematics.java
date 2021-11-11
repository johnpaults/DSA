package geeksforgeeks.mathematics;

import java.time.LocalTime;

public class Mathematics {
    public static void main(String ...args) {
        System.out.println("Number of digits of the number 764647223 is " + FindDigit.numberOfDigit(764647223));
        System.out.println("Palidrome of 100001 is " + Palindrome.isPalindromeNumber(100001));
        System.out.println("Factorials of 100 is " + Factorials.findFact(10));
        System.out.println("Factorials of 5 using recursion is " + Factorials.findFactorialsRecrusion(10));
        System.out.println("Trailing no of zeros in factorials of 100 is " + new TrailingZerosOfFactorials().findTailingZeroOfFact(10));
        System.out.println("GCD of 9 and 27 is " + GCD.findGCD(9, 27));
        System.out.println("LCM of 45 and 30 is " + LCM.findLCM(45, 30));
        System.out.println("Is 13 is prime number ? " + (PrimeNumber.isPrimeNumber(13) ? "yes" : "no"));
        DivisiorOfNumber.printDivisorOfNum(15);
    }
}
