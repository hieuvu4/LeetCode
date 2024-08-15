package hard.findkthSmallestPairDistance;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int smallestDistancePair(int[] nums, int k) {
        ArrayList<Integer> distances = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                int currDist = Math.abs(nums[i]-nums[j]);
                distances.add(currDist);
            }
        }
        Collections.sort(distances);
        return distances.get(k);
    }
}

// slow with a lot of values!!