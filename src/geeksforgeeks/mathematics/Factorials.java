package geeksforgeeks.mathematics;

public class Factorials {
    public static double findFact(int num) {
        double fact = 1L;
        for (int i = 2; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static double findFactorialsRecrusion(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFactorialsRecrusion(num - 1);
    }
}
