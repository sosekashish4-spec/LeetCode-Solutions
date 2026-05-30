class Solution {
    public int divide(int dividend, int divisor) {
        double rem=dividend%divisor;
        double quo=(dividend-rem)/divisor;
        return (int)quo;
    }
}