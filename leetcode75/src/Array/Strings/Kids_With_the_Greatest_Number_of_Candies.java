package Array.Strings;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {


    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};

        int extracandies = 1;

        List<Boolean> sonuc = kidsWithCandies(candies, extracandies);



    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int lentghOfList = candies.length;
        List<Boolean> listOfResult = new ArrayList<>(lentghOfList);
        for (int i = 0; i < lentghOfList; i++){
            listOfResult.add(false);
        }
        for(int i = 0; i < lentghOfList; i++){
            int currentCandy = candies[i] +  extraCandies;
            boolean isItGreatest = false;
            for(int j = 0; j < lentghOfList; j++){
                if(currentCandy < candies[j]){
                    isItGreatest = false;
                    break;
                }else {
                    isItGreatest = true;
                }
            }
            if(isItGreatest){
                listOfResult.set(i, true);
            }else {
                listOfResult.set(i, false);
            }
        }
        return listOfResult;
    }
}
