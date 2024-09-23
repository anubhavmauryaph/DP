public class SequencePatternMatching {
    public static void main(String[] args) {
        // string 1 present in string 2 ture or false
        String a = "xyz";
        String b = "abxcpy";
        int aLength = a.length();
        int bLength = b.length();
        int lcs = LongestCommonSubsequenceTopDown.LCS(a, b, aLength, bLength);
        boolean result = lcs == aLength ? true : false;
        System.out.println(result);
    }
}
