class Solution {
    public int addDigits(int num) {
        if(num==0)
        {
            return 0;
        }
        int sum=0;
        while(num>=0)
        {
           int temp=num%10;
           sum=sum+temp;
           num=num/10;
        }
        int digitsum=0;
        while(sum>=0)
        {
           int temp=sum%10;
           digitsum=digitsum+temp;
           sum=sum/10;
        }
        return digitsum;
    }
}
