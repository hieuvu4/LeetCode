package easy.checkIfAWordOccursAsAPrefixOfAnyWordInASentence;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for(int i = 0; i < strings.length; i++) {
            if (searchWord.length() <= strings[i].length()) {
                int minLength = Math.min(searchWord.length(), strings[i].length());
                String s = strings[i].substring(0, minLength);
                if(s.equals(searchWord)) return i+1;
            }
        }
        return -1;
    }
}
