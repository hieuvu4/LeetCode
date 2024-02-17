package medium.furthestBuildingYouCanReach;

public class Solution {
    public static void main(String[] args) {
        int[] heigths = {4,2,7,6,9,14,12};
        int bricks = 5;
        int ladders = 1;

        System.out.println(furthestBuilding(heigths, bricks, ladders));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int furthestBuildingIndex = 0;
        for(int i = 1; i < heights.length; i++) {
            if(heights[furthestBuildingIndex] < heights[i]) {
                if(heights[i]-heights[furthestBuildingIndex] <= bricks  && bricks > 0) {
                    bricks -= heights[i]-heights[furthestBuildingIndex];
                    furthestBuildingIndex = i;
                } else if (ladders > 0) {
                    ladders--;
                    furthestBuildingIndex = i;
                } else {
                    break;
                }
            } else {
                furthestBuildingIndex = i;
            }
        }
        return furthestBuildingIndex;
    }

}
