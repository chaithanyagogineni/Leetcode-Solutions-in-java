class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int res[]=new int[2];
        int total=0;
        int num_of_lines=1;

        for(int i=0;i<S.length();i++)
        {
            if(total+widths[(int)S.charAt(i)-97]<=100)
            {
                total+=widths[(int)S.charAt(i)-97];
            }
            else
            {
                total=0;
                total+=widths[(int)S.charAt(i)-97];
                num_of_lines++;
            }
        }
        res[0]=num_of_lines;
        res[1]=total;
        return res;
    }
}