//Problem 771 in leetcode

class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
        for(int i=0;i<S.length();i++)
        {
            if(J.indexOf(S.charAt(i))!=-1)
                res++;
        }
        return res;
    }
}