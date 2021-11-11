package geeksforgeeks.mathematics;

public class GCD {
    public static int findGCD (int a, int b) {
        while( a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
