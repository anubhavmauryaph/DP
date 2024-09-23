public class LongestRepeatingSubsequence {
    public static int LRS(String x, String y, int xLength, int yLength){

        int[][] table = new int[xLength+1][yLength+1];

        // Base Condition no need because array filled with zero. 
        for (int i = 1; i < xLength+1  ; i++) {
            for (int j = 1; j < yLength+1; j++) {

                if (x.charAt(i-1) == y.charAt(j-1) && i!=j) {
                    
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        return table[xLength][yLength];
    }
    public static void main(String[] args) {
        String s = "AABEBCDD";
        int longestRepeating = LRS(s, s, s.length(), s.length());
        System.out.println(longestRepeating);
    }
}
