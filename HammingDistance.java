//Problem 461 in Leetcode

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}