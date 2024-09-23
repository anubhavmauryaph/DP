public class LongestPalindromicSubsequence {
    public static int LCPS (String s){

        String sReverse = new StringBuffer(s).reverse().toString();
        int comman = LongestCommonSubsequenceTopDown.LCS(s, sReverse, s.length(), sReverse.length());
        return comman;
    }
    public static void main(String[] args) {
        String a = "agbcba";
        System.out.println(LCPS(a));

    }

}
