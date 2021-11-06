package geeksforgeeks.mathematics;

public class Mathematics {
    public static void main(String ...args) {
        System.out.println("Number of digits of the number 764647223 is " + FindDigit.numberOfDigit(764647223));
        System.out.println("Palidrome of 100001 is " + Palindrome.isPalindromeNumber(100001));
        System.out.println("Factorials of 5 is " + Factorials.findFact(5));
        System.out.println("Factorials of 5 using recursion is " + Factorials.findFactorialsRecrusion(5));
    }
}
