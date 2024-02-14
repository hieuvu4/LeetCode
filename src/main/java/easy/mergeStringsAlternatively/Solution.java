package easy.mergeStringsAlternatively;

public class Solution {

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));

    }

    public static String mergeAlternately(String word1, String word2) {    
        StringBuilder stringBuilder = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);
        for(int i = 0; i < maxLength; i++) {
            if(i < length1) stringBuilder.append(word1.charAt(i));
            if(i < length2) stringBuilder.append(word2.charAt(i));
        }

        return stringBuilder.toString();
    }
    
}
