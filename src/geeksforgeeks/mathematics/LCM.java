package geeksforgeeks.mathematics;

public class LCM {

    public static int findLCM(int a, int b) {
        int gcd = GCD.findGCD(a, b);
        return (a * b) / gcd;
    }
}
