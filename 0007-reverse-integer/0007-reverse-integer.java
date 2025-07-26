class Solution {
    public int reverse(int x) {
        int temp = 0;
        while (x != 0) {
            int et = x % 10;
            x /= 10;

            // Check for overflow
            if (temp > Integer.MAX_VALUE / 10 || (temp == Integer.MAX_VALUE / 10 && et > 7)) return 0;
            if (temp < Integer.MIN_VALUE / 10 || (temp == Integer.MIN_VALUE / 10 && et < -8)) return 0;

            temp = temp * 10 + et;
        }
        return temp;
    }
}