package easy.powerOfTwo;

public class Solution {
    
    public static void main(String[] args) {
        int n = 16;

        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (Math.pow(2, 30) % n == 0);
    }
}
