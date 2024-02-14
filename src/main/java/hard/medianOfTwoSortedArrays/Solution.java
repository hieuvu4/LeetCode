package hard.medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merging
        int[] nums = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++) {
            nums[i+nums1.length] = nums2[i];
        }
        Arrays.sort(nums);

        double median;

        // calculating median
        if(nums.length % 2 == 0) {
            median = (double)(nums[nums.length/2-1]+nums[nums.length/2])/2;
        } else {
            median = (double)(nums[nums.length/2]);
        }
        return median;
    }
}
