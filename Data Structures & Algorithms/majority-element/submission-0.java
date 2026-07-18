class Solution {
    public int majorityElement(int[] nums) {
     int count =1;
     int max = nums[0];
   
  for(int i=1;i<nums.length;i++) 
     {
        if(nums[i]==max)
        {
         count++;
        }
        else if(count==0)
        {
            max = nums[i];
            count++;
        }
        else{
          count--;
        }
     }  
     int cnt1 =0;
     for(int i=0; i<nums.length;i++)
     {
        if(nums[i]==max)
        {
            cnt1++;
        }
        if(cnt1>(nums.length)/2)
        {
            return max;
        }
     }
return -1;
    }
}