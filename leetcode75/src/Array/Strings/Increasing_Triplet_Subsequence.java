package Array.Strings;

public class Increasing_Triplet_Subsequence {

    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));

    }


    public static boolean increasingTriplet(int[] nums) {

        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
        /* Geçiyo ama time limite takılıyor
        int lengthOfNums = nums.length;
        if(lengthOfNums == 1 || lengthOfNums == 2){
            return false;
        }else  {
            for (int i = 0; i< lengthOfNums; i++){
                if(i < lengthOfNums-2){
                    for (int j = i+1; j < lengthOfNums-1; j++){
                        if(nums[i] < nums[j]){
                            for(int k = j+1; k<=  lengthOfNums-1; k++){
                                if(nums[j] < nums[k]){
                                    return true;
                                }
                            }
                        }
                    }
                }

            }
        }

        return false;

         */

        /* YANLIŞ ANLADIĞIM ÇÖZÜM
        if(lengthOfNums == 1 || lengthOfNums == 2){
            return false;
        }else  {
            for (int i = 0; i< lengthOfNums; i++){
                if(i < lengthOfNums-2){
                    if(nums[i] < nums[i+1] && nums[i+1] < nums[i+2]){
                        return true;
                    }
                }

            }
        }
        return false;
         */
    }

}
