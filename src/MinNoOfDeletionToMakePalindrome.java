public class MinNoOfDeletionToMakePalindrome {
    public static void main(String[] args) {
        String s = "agbcba";
        // length of LCPS increse then no of deletion become minimum.
        int palindromeLength = LongestPalindromicSubsequence.LCPS(s);
        int deletion = s.length() - palindromeLength;
        System.out.println(deletion);

    }
}
