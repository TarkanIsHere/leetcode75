package Array.Strings;

public class Greatest_Common_Divisor_of_Strings {


    public static void main(String[] args) {


        String result = gcdOfStrings("ABC", "ABCABC");
        System.out.println(result);
    }

    public static String gcdOfStrings(String str1, String str2) {

        if(!((str1 + str2).equals(str2 + str1))){
            return "";
        }


        int greatestCommonDivider = gcd(str1.length(), str2.length());



        return str2.substring(0, greatestCommonDivider);
    }

    // GCD Algorithm (Euclid)
    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }else {
            return  gcd(b, a%b);
        }

    }





    /* KENDİ BAŞIMA DENEDİĞİM ÇÖZÜM (BAŞARISIZ)
    public static String gcdOfStrings(String str1, String str2) {

        String commonDivider = "";
        int lengthOfStr1 = str1.length();
        int lengthOfStr2 = str2.length();

        int count = 1;

        char[] ch1 = new char[lengthOfStr1];
        char[] ch2 = new char[lengthOfStr2];


        boolean isItTrueFor1 = false;
        boolean isItTrueFor2 = false;

        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            ch2[i] = str2.charAt(i);
        }

        if (ch1[0] == ch2[0]) {
            int i = 0;
            while (i < lengthOfStr1 && i < lengthOfStr2) {
                if (ch1[i] == ch2[i]) {

                    if (count == 1){
                        commonDivider += ch1[i];
                        count += 1;
                    } else {
                        if (ch1[0] == ch1[lengthOfStr1-count]) {
                            if (ch2[0] == ch2[lengthOfStr2-count]){
                                count +=1;
                                commonDivider += ch1[i];
                            }
                        }

                    }

                }

                i++;
            }

            return commonDivider;
        } else {
            return "";
        }

    }


     */
}




