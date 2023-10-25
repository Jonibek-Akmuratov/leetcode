package jda.October._23;


/**
 * 342. Power of Four
 */
public class PowerOfFour {
    public static void main(String[] args) {

    }

    public static boolean isPowerOfFour(int n) {

        if (n == 1)
            return true;

        else if (n < 1 || n % 4 != 0)
            return false;

        return isPowerOfFour(n / 4);
    }
}
