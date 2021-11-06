package geeksforgeeks.mathematics;

public class Palindrome {
    public static boolean isPalindromeNumber (int num) {
        int rev = 0;
        int temp = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return temp == rev;
    }
}
