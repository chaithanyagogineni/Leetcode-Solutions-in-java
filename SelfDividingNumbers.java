class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int cur_val=0,rem=0;
        ArrayList result = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            cur_val=i;
            while(cur_val>0)
            {
                rem=cur_val%10;
                if(rem==0||i%rem!=0)
                    break;
                cur_val=cur_val/10;
            }
            if(cur_val==0)
                result.add(i);
        }
        return result;

    }
}