package easy.lengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        String s = " fly me to the   moon  ";
        System.out.println(lengthOfLastWord(s));
    }


    public static int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
        return sArr[sArr.length-1].length();
    }
}