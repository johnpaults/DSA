package geeksforgeeks.mathematics;

public class FindDigit {
    public static int numberOfDigit(int number) {
        int x = 0;
        while (number > 0) {
            number = number / 10;
            x++;
        }
        return x;
    }
}
