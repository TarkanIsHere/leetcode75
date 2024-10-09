package Array.Strings;

public class Merge_Strings_Alternately {

    public static void main(String[] args) {

        String result = mergeAlternately("abcd", "pq");
        System.out.println(result);
    }


    public static String mergeAlternately(String word1, String word2) {
        String concenationOfString = "";
        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();
        int remainLengthOfForLoop = 0;
        char[] ch1 = new char[lengthOfWord1];
        char[] ch2 = new char[lengthOfWord2];
        char[] longestWordCharArray;

        for (int i = 0; i < word1.length(); i++) {
            ch1[i] = word1.charAt(i);
        }

        for (int i = 0; i < word2.length(); i++) {
            ch2[i] = word2.charAt(i);
        }

        int lenghtOfForLoop = 0;

        if(lengthOfWord2 == lengthOfWord1){
            lenghtOfForLoop = lengthOfWord2;
            longestWordCharArray  = ch2;
            remainLengthOfForLoop = lengthOfWord2 - lengthOfWord1;
        } else if (lengthOfWord2 > lengthOfWord1) {
            lenghtOfForLoop = lengthOfWord1;
            remainLengthOfForLoop = lengthOfWord2 - lengthOfWord1;
            longestWordCharArray = ch2;
        }
        else {
            lenghtOfForLoop = lengthOfWord2;
            remainLengthOfForLoop = lengthOfWord1 - lengthOfWord2;
            longestWordCharArray = ch1;
        }

        for(int i = 0; i < lenghtOfForLoop; i++){
            concenationOfString += ch1[i];
            concenationOfString += ch2[i];
        }

        for (int i = 0; i < remainLengthOfForLoop; i++){
            concenationOfString += longestWordCharArray[lenghtOfForLoop + i];
        }
        return concenationOfString;
    }

    /* ALTERNATİVE SOLUTİON

    class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
       }
    }


     */
}
