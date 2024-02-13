package medium.removeDuplicatesFromSortedArrayII;

import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        // int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int currentNum = Integer.MIN_VALUE;
        int amountCurrentNums = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == currentNum && amountCurrentNums == 1) {
                nums[k] = currentNum;
                k++;
                amountCurrentNums = 0;
            } 
            if(nums[i] != currentNum) {
                currentNum = nums[i];
                nums[k] = currentNum;
                k++;
                amountCurrentNums = 0;
                amountCurrentNums++;
            } 
        
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
