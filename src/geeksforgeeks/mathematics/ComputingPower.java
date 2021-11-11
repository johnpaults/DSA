package geeksforgeeks.mathematics;

public class ComputingPower {
    public static int findPower(int n, int p) {
        if(p == 0)
            return 1;
        if(p == 1)
            return n;

        int res = 1;
        for (int i = 0; i <p; i++) {
            res = res * n;
        }
        return res;
    }

    public static int interativePower(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0)
                res = res * x;
            x = x*x;
            n = n / 2;
        }
        return res;
    }
}
