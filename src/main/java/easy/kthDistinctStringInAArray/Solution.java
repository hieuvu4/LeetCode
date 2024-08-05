package easy.kthDistinctStringInAArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countElements = new HashMap<>();
        for (String s : arr) {
            if(!countElements.containsKey(s)) {
                countElements.put(s, 1);
            } else {
                countElements.merge(s, 1, Integer::sum);
            }
        }
        ArrayList<String> distinctElements = new ArrayList<>();
        
        for(String s: arr) {
            if(countElements.get(s) == 1) {
                distinctElements.add(s);
            }
        }

        if(k > distinctElements.size()) {
            return "";
        }
        return distinctElements.get(k-1);
    }
}