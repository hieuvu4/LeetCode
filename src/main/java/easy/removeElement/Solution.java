package easy.removeElement;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums, val));;
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int countSwap = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                countSwap++;
            }
            else {
                k++;
            }
        }
        swap(nums, val, countSwap);
        System.out.println(Arrays.toString(nums));
        return k;
    }

    private static void swap(int[] nums, int val, int amountSwaps) {
        int endpointer = nums.length-1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                for(int j = 0; j < amountSwaps; j++) {
                    int temp = nums[i];
                    nums[i] = nums[endpointer];
                    nums[endpointer] = temp;
                    i++;
                    endpointer--;
                }
                break;
            }
        }
    }
}
