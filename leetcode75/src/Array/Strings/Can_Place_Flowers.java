package Array.Strings;

import java.util.ArrayList;
import java.util.List;

public class Can_Place_Flowers {

    public static void main(String[] args) {

        int[] flowerbed = {1, 1};

        System.out.println(canPlaceFlowers(flowerbed, 0));


    }
    
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int lengthOfArray = flowerbed.length;
        int availableSpace = 0;
        boolean isItTrue = false;
        List<Integer> forbiddenIndex = new ArrayList<>();

        if (lengthOfArray == 1) {
            if (flowerbed[0] == 0 && (n == 1 || n == 0)) {
                isItTrue = true;
            } else if (flowerbed[0] == 1 && n == 0) {
                isItTrue = true;
            } else {
                isItTrue = false;
            }
            return isItTrue;
        } else if (lengthOfArray == 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0 && (n <= 1)) {
                isItTrue = true;
                return isItTrue;
            } else if (flowerbed[0] == 1 || flowerbed[1] == 1) {
                if (n == 0) {
                    isItTrue = true;
                    return isItTrue;
                } else {
                    isItTrue = false;
                    return isItTrue;
                }
            }
        }
         else {
            for (int i = 0; i < lengthOfArray; i++) {
                if (i == 0) {
                    if (flowerbed[i] == 1 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                        if (!(forbiddenIndex.contains(i + 2))) {
                            flowerbed[i + 2] = 1;
                            availableSpace += 1;
                            forbiddenIndex.add(i + 1);
                            forbiddenIndex.add(i + 3);
                        }

                    } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        if (!(forbiddenIndex.contains(i))) {
                            flowerbed[i] = 1;
                            availableSpace += 1;
                            forbiddenIndex.add(i);
                        }
                    }
                } else if (i == lengthOfArray - 1) {
                    if (flowerbed[i] == 1 && flowerbed[i - 1] == 0 && flowerbed[i - 2] == 0) {
                        if (!(forbiddenIndex.contains(i - 2))) {
                            flowerbed[i - 2] = 1;
                            availableSpace += 1;
                            forbiddenIndex.add(i - 1);
                            forbiddenIndex.add(i - 3);
                        }

                    } else if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                        if (!(forbiddenIndex.contains(i))) {
                            flowerbed[i] = 1;
                            availableSpace += 1;
                            forbiddenIndex.add(i);
                        }
                    }
                } else {
                    if (flowerbed[i] == 0) {
                        if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                            if (!(forbiddenIndex.contains(i))) {
                                flowerbed[i] = 1;
                                availableSpace += 1;
                                forbiddenIndex.add(i + 1);
                                forbiddenIndex.add(i - 1);
                            }

                        }
                    }


                }
            }

            if (availableSpace >= n) {
                isItTrue = true;
            }

            return isItTrue;
        }
        return isItTrue;

    }
}






