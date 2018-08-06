class Solution {
    public String toLowerCase(String str) {
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                if((int)str.charAt(i)<=90)
                {
                    res+=(char)(str.charAt(i)+32);
                }
                else
                    res+=str.charAt(i);
            }
            else
                res+=str.charAt(i);
        }
        return res;
        
    }
}