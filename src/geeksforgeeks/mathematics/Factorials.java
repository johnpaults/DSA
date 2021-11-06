package geeksforgeeks.mathematics;

public class Factorials {
    public static int findFact(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static int findFactorialsRecrusion(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFactorialsRecrusion(num - 1);
    }
}
