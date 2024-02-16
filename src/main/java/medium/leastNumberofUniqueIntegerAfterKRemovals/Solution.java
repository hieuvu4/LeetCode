package medium.leastNumberofUniqueIntegerAfterKRemovals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));

    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        // count amount of every element with key and value
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        System.out.println(map.entrySet());
        System.out.println(list);
        list.sort((a, b) -> a.getValue() - b.getValue());
        System.out.println(list);

        for (Map.Entry<Integer, Integer> entry : list) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
}
