public class MinNoOfInsertionAndDeletion {
    // Minimum No of Insetion and Deletion to convert a into b. 

    public static void main(String[] args) {
        // In both string LCS is comman 
        // to convert a --> b 
        //no of deletion required  = aLength - LCS
        //no of insertion required  = bLength - LCS
        String a = "heap";
        String b = "pea";
        int aLength = a.length();
        int bLength = b.length();
        int comman = LongestCommonSubsequenceTopDown.LCS(a, b, aLength, bLength);
        int deletion = aLength - comman;
        int insertion = bLength - comman;

        System.out.println("Insertion : "+insertion+"\nDeletion : "+deletion);


    }
}
