package easy.longestCommonPrefix;

import java.util.stream.Stream;

public class Solution {
    
    public static void main(String[] args) {
     
        String[] strings = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }


    public static String longestCommonPrefix(String[] strs) {
        if(strs == null) return "";
        int minSize = Integer.MAX_VALUE;
        for(String s: strs) minSize = Math.min(minSize, s.length());

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < minSize; i++) {
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != strs[0].charAt(i)) return stringBuilder.toString();
            }
            stringBuilder.append(strs[0].charAt(i));
        }

        return stringBuilder.toString();
    }
}
