class Solution {
    public int maximumCount(int[] arr) {
       int countpos=0;
       int countneg=0;

       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>0)
           {
               countpos++;
           }
           if(arr[i]<0)
           {
               countneg++;
           }
       }
       int a;
       if(countpos<countneg)
       {
           return countneg;
       }
       return countpos;

    }
}
