class Solution {
    public int[] singleNumber(int[] nums) {
        int xory=0;
        for(int val:nums)
        {
            xory=xory^val;
        }
        int rmsb=xory & -xory;

        int x=0;
        int y=0;

        for(int val:nums)
        {
            if((val &rmsb)==0)
            {
                x=x^val;
            }
            else
            {
                y=y^val;
            }
        }
        return new int[]{x,y};
    }
}

