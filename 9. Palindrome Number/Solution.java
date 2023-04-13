class Solution {
    public boolean isPalindrome(int num) {
        int rev=0;
        int nums=num;
        while(num>0)
        {
            int temp=num%10;
            rev=(rev*10)+temp;
            num=num/10;
        }
        if(nums==rev)
        {
            return true;
        }

        return false;
    }
}
