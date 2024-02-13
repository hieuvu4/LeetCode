package easy.mergedSortedArray;

import java.util.Arrays;

public class Solution {
    
    static int temp;

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for merged array

        // Start merging from the end of arrays
        while (i >= 0 && j >= 0) {
            // If element in nums1 is greater, place it at kth position
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else { // If element in nums2 is greater, place it at kth position
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, place them in nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
    }

     
}
