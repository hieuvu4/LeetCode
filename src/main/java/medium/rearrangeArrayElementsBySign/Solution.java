package medium.rearrangeArrayElementsBySign;

import java.util.Arrays;

public class Solution {
    

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};

        rearrangeArray(nums);

    }


    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i < result.length; i++) {
            if(nums[i] > 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
