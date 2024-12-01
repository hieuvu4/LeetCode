package easy.lemonadeChange;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five_dollars = 0, ten_dollars = 0;

        for (int x : bills) {
            switch (x) {
                case 5:
                    five_dollars++;
                    break;
                case 10:
                    if (five_dollars > 0) {
                        five_dollars--;
                        ten_dollars++;
                    } else {
                        return false;
                    }   break;
                default:
                    if (five_dollars > 0 && ten_dollars > 0) {
                        five_dollars--;
                        ten_dollars--;
                    } else if (five_dollars > 2) {
                        five_dollars -= 3;
                    } else {
                        return false;
                    }   break;
            }
        }

        return true;
    }
}
