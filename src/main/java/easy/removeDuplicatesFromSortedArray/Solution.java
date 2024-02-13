package easy.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int currentNum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != currentNum) {
                currentNum = nums[i];
                nums[k] = currentNum;
                k++;
            } 
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

}
