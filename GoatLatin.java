class Solution {
    public String toGoatLatin(String S) {
        String arr[] = S.split(" ");
        StringBuilder temp= new StringBuilder("a");
        StringBuilder res=new StringBuilder();
        String vowels="aeiou";
        for(int i=0;i<arr.length;i++)
        {
            
            if(vowels.indexOf(arr[i].toLowerCase().charAt(0))!=-1)
            {
                res.append(arr[i]+"ma"+temp);
            }
            else
            {
                res.append(arr[i].substring(1)+arr[i].charAt(0)+"ma"+temp);
            }
            if(i!=arr.length-1)
                res.append(" ");
            temp.append("a");
        }
        return res.toString();
    }
}