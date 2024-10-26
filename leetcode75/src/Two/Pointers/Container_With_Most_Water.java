package Two.Pointers;

public class Container_With_Most_Water {

    public static void main(String[] args) {

        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(array));
    }


    public static int maxArea(int[] height) {

        /*
        // Doğru ama time exceed oldu.
        int leftIndex = 0;
        int rightIndex = 0;
        int maxResult = 0;
        int currResult = 0;
        int gap = 0;
        int heightOfPool = 0;

        while(leftIndex < height.length){
            rightIndex = leftIndex + 1;
            while(rightIndex < height.length){
                currResult = 0;
                gap = rightIndex - leftIndex;
                if(height[rightIndex] >= height[leftIndex]){
                    heightOfPool = height[leftIndex];
                }else {
                    heightOfPool = height[rightIndex];
                }
                currResult = gap * heightOfPool;
                if(currResult >= maxResult){
                    maxResult = currResult;
                }
                rightIndex += 1;
            }
            leftIndex += 1;

        }
        return maxResult;
         */
        return 1;
    }
}








