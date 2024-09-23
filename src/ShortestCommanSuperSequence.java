public class ShortestCommanSuperSequence {
    public static void main(String[] args) {
        // both sting have LCS 
        // Maximum Possible lenth is lenth of LCS(a) + LCS(b) - LCS
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int aLength = a.length();
        int bLength = b.length();

        int comman = LongestCommonSubsequenceTopDown.LCS(a, b, aLength, bLength);
        int shortest = aLength + bLength - comman;
        System.out.println(shortest);

    }
}
