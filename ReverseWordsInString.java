class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder temp=new StringBuilder(arr[i]);
            if(i!=arr.length-1)
            res.append(temp.reverse()+" ");
            else
                res.append(temp.reverse());
            
        }
        return res.toString();
    }
}