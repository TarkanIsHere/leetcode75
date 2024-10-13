package Array.Strings;

import java.util.*;

public class Reverse_Vowels_of_a_String {


    public static void main(String[] args) {
        System.out.println(reverseVowels("LeetCode"));
    }


    public static String reverseVowels(String s) {

        int lengthOfString = s.length();
        char[] ch = s.toCharArray();

        // Sesli harfleri bir Set içerisinde tutarak daha hızlı erişim sağlayalım
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        // İki pointer kullanarak string içindeki sesli harfleri ters çevirelim
        int left = 0;
        int right = lengthOfString - 1;

        while (left < right) {
            // Soldan gelen pointer bir sesli harf bulana kadar ilerler
            while (left < right && !vowels.contains(ch[left])) {
                left++;
            }
            // Sağdan gelen pointer bir sesli harf bulana kadar geriler
            while (left < right && !vowels.contains(ch[right])) {
                right--;
            }
            // Sesli harfleri yer değiştir
            if (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        return new String(ch);
        /* BENİM ÇÖZÜMÜM AMA TİME LİMİTİ GEÇİYOR
        int lengthOfString = s.length();
        List<Character> characterList = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        List<Integer> vowelIndexes = new ArrayList<>();

        List<Character> vowelsContain = new ArrayList<>();

        String result = "";

        char[] ch = s.toCharArray();

        for(int i = 0; i < lengthOfString; i++){
            if(vowels.contains(ch[i])){
                vowelsContain.add(ch[i]);
                vowelIndexes.add(i);
            }
        }
        // Terse çevirme
        Collections.reverse(vowelsContain);
        int query = 0;
        for(int i = 0; i < lengthOfString; i++){
            if(!vowelIndexes.contains(i)){
                result += ch[i];
            } else {
                result += vowelsContain.get(query);
                query += 1;
            }
        }
        return result;

         */
    }

}
