package Array.Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reverse_Words_in_a_String {


    public static void main(String[] args) {
        System.out.println("merhaba  ".length());

        System.out.println(reverseWords("  the sky is blue"));
    }

    public static String reverseWords(String s) {

        int lengthOfString = s.length();

        char[] ch = new char[lengthOfString];
        String word = "";
        List<String> listOfString = new ArrayList<>();
        String lastWord = "";

        for (int i = 0; i < lengthOfString; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i< lengthOfString; i++){

            if(ch[i] == ' ' && i != 0){
                if(word != ""){
                    listOfString.add(word);
                }
                word = "";
            } else if (ch[i] == ' ' && i == 0) {
                word = "";
            } else {
                word += ch[i];
            }

        }

        if (word != ""){
            listOfString.add(word);

        }
        Collections.reverse(listOfString);

        for(int i = 0; i <listOfString.size(); i ++){
            if (i != listOfString.size()-1){
                lastWord += listOfString.get(i) + " ";
            } else {
                lastWord += listOfString.get(i);
            }
        }
        return lastWord;
    }














}
