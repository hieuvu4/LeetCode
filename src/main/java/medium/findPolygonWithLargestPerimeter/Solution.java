package medium.findPolygonWithLargestPerimeter;

import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        int[] nums = {1,12,1,2,5,50,3};
        System.out.println(largestPerimeter(nums));
    }

    // a1 + a2 + a3 > ak
    // muss nicht für alle elemente gelten, sondern nur für das letzte element
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for(int i = nums.length-1; i > 0; i--) {
            if(nums[i] < sum-nums[i]) {
                return sum;
            }
            else {
                sum = sum-nums[i];
            }
        }
        return -1;
    }
}
