package Two.Pointers;

import java.util.Arrays;
import java.util.Collections;

public class Move_Zeroes {

    public static void main(String[] args) {

        int[] array = {0,1,0,3,12};
        moveZeroes(array);

    }


    public static void moveZeroes(int[] nums) {

        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left ++;
            }


        }





        /*
        // Left 0 bulacak
        // right 0'dan farklı bulacak

        int leftPointerIndex = 0;
        int rightPointerIndex = nums.length -1;
        int temp = 1;

        while(leftPointerIndex < rightPointerIndex){
            while (nums[leftPointerIndex] != 0){
                leftPointerIndex ++;
            }
            while (nums[rightPointerIndex] == 0){
                rightPointerIndex --;
            }
            if(leftPointerIndex < rightPointerIndex){
                temp = nums[leftPointerIndex];
                nums[leftPointerIndex] = nums[rightPointerIndex] ;
                nums[rightPointerIndex] = temp;
            }
        }


         */

    }

}
