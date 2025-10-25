package easy.calculateMoneyInLeetCodeBank;

class Solution {
    
    public int totalMoney(int n) {
        int result = 0;
        int weeks = n / 7;
        int days = n % 7;
        
        for (int i = 0; i < weeks; i++) {
            for (int j = 1; j <= 7; j++) {
                result += i + j;
            }
        }
        for (int i = 1; i <= days; i++) {
            result += weeks + i;
        }
        return result;
    }
}
