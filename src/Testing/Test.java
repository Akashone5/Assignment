package Testing;

import java.util.*;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                long n = sc.nextLong();
                long k = sc.nextLong();

                long totalPopcount = 0;
                long bitValue = 1;
                while (n > 0 && bitValue <= n) {
                    long maxTake = n / bitValue;
                    long actualTake = Math.min(k, maxTake);
                    totalPopcount += actualTake;
                    n -= actualTake * bitValue;
                    bitValue *= 2;
                }
                System.out.println(totalPopcount);
            }
        }
        sc.close();
    }
}
