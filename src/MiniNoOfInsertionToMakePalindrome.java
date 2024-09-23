public class MiniNoOfInsertionToMakePalindrome {

    public static void main(String[] args) {
        // in deletion those element have not their pair delet it 
        // in insertion those element have not their part insert it. 
        // so no of deletion = no of insertion. 

        String s = "aebcbda";
        // length of LCPS increse then no of deletion become minimum.
        int palindromeLength = LongestPalindromicSubsequence.LCPS(s);
        int insertion = s.length() - palindromeLength;
        System.out.println(insertion);
    }
}
