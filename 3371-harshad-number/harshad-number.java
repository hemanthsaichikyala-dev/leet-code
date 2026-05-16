class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int temp = x;
        int sum = 0;

        while (temp > 0) {
            int r = temp % 10;
            sum += r;
            temp = temp / 10;
        }

        if (x % sum == 0)
            return sum;

        return -1;
    }
}