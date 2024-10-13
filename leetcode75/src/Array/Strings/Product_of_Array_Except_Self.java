package Array.Strings;

public class Product_of_Array_Except_Self {

    public static void main(String[] args) {

        int[] deneme = {-1,1,0,-3,3};
        System.out.println(productExceptSelf(deneme)[1]);
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;

        /*
        int lengthOfNums = nums.length;

        int[] results = new int[lengthOfNums];
        int product = 0;
        for(int i = 0; i < lengthOfNums; i++){
            product = 0;
            for(int j = 0; j< lengthOfNums; j++){
                if(i == j){
                    // bisi yapmadan geç, burada niye i != j yapmadım ben de bilmiyorum.
                }else {
                    if(nums[j] == 0){
                        product = 0;
                        break;
                    }

                    if(product == 0){
                        product += nums[j];
                    }else {
                        product *= nums[j];

                    }

                }

            }
            results[i] = product;


        }



        return results;


         */
    }


}
