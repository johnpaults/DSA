package geeksforgeeks.mathematics;

public class findDigit {
    public static void main(String ...args){
        System.out.println(findDigit.numberOfDigit(2378664));
    }
    public static int numberOfDigit(int number) {
        int x = 0;
        while (number > 0) {
            number = number / 10;
            x++;
        }
        return x;
    }
}
