//Problem 804 in leetcode

import java.util.HashSet;
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String temp="";
        HashSet<String> hs=new HashSet<String>();
        for(int i=0;i<words.length;i++)
        {
            temp="";
            for(int j=0;j<words[i].length();j++)
            {
                temp+=arr[(int)words[i].charAt(j)-97];
            }
            if(!hs.contains(temp))
                hs.add(temp);
            System.out.println(temp);
        }
        return hs.size();
    }
}