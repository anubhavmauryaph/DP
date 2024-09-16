public class LongestCommanSubsequence {
    
    public static int LCS(String x, String y, int xLength, int yLength){

        // Base Condition 
        if (xLength == 0 || yLength == 0) {
            return 0;
        }
        
        if (x.charAt(xLength-1) == y.charAt(yLength-1)) {
            
            return 1+LCS(x, y, xLength-1, yLength-1);
        }

        return Math.max(LCS(x, y, xLength-1, yLength), LCS(x, y, xLength, yLength-1));
    }
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";
        System.out.println(LCS(x, y, x.length(), y.length()));
    }

}
