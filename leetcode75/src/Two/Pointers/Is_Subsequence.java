package Two.Pointers;

public class Is_Subsequence {

    public static void main(String[] args) {

        System.out.println(isSubsequence("axc", "ahbgdc"));

    }

    public static boolean isSubsequence(String s, String t) {
        // BU ÇÖZÜMÜM %100 BEATS oranına sahip.
        int lenghtOfLittleString  = s.length();
        int lengthOfBiggerString  = t.length();
        int littleIndex = 0;
        int bigIndex = 0;
        char[] little = s.toCharArray();
        char[] big = t.toCharArray();
        if(lenghtOfLittleString == 0){
            return true;
        }
        while(bigIndex < lengthOfBiggerString){
            if(little[littleIndex] == big[bigIndex]){
                littleIndex += 1;
                if (littleIndex == lenghtOfLittleString){
                    return true;
                }
            }
            bigIndex += 1;
        }

        return false;
    }
}
