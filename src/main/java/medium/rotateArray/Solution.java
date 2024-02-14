package medium.rotateArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }


    public static void rotate(int[] nums, int k) {
        // for the case if k negative -> -1 == 6
        // and no "endless" rotation because for arr.length = 7 -> 7 = 14 = 21 = etc.
        k = k % nums.length;
        k += (k < 0)? nums.length: 0;
        rotate(nums, 0, nums.length-k-1);
        rotate(nums, nums.length-k, nums.length-1);
        rotate(nums, 0, nums.length-1);
    }

    private static void rotate(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    


    
    // Test Failed: Time Limit Exceeded
    public static void rotate2(int[] nums, int k) {
        for(int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];
            for(int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
