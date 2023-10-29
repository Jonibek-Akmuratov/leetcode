package jda.October;


public class LongestPalindrome {
    static char[] chars;
    static int[] maxPalindromeStr;

    public static void main(String[] args) {
        longestPalindrome("babad");
    }

    public static String longestPalindrome(String s) {

        chars = s.toCharArray();
        maxPalindromeStr = new int[]{0, 0};

        int strLength = s.length();

        for (int i = 0; i < strLength; i++) {
            for (int j = i + maxPalindromeStr[1] - maxPalindromeStr[0]; j < strLength; j++) {
                checkPalindrome(i, j);
            }
        }
        return s.substring(maxPalindromeStr[0]-1, maxPalindromeStr[1] -1);
    }

    private static void checkPalindrome(int startIndex, int endIndex) {

        for (int i = startIndex; i < (startIndex + endIndex) / 2; i++) {
            if (chars[i] != chars[endIndex - i])
                return;
        }
        maxPalindromeStr[0] = startIndex;
        maxPalindromeStr[1] = endIndex;
    }


}

//  todo v1 version is fail

//    public String longestPalindrome(String s) {
//
//        char[] chars = new char[s.length()];
//        StringBuilder stringBuilder = new StringBuilder(s);
//        String maxStr = "";
//        int strLength = s.length();
//        for (int i = 0; i < strLength; i++) {
//            for (int j = i + maxStr.length(); j < strLength; j++) {
//                String substring = stringBuilder.substring(i, j);
//                if (isValid(substring))
//                    maxStr = substring;
//            }
//        }
//        return maxStr;
//    }
//
//    public boolean isValid(String str) {
//        return Objects.equals(new StringBuilder(str).reverse().toString(), str);
//    }