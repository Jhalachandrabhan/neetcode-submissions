class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i =0; i<nums.length; i++)
        {
            if(freq.containsKey(nums[i]))
            {
                freq.put(nums[i] , freq.get(nums[i]) +1);
            }
            else
            {
              freq.put(nums[i] , 1) ;
            }
        } 
        List<Integer> res = new ArrayList<>();
          for(int key : freq.keySet())
        {
            if(freq.get(key)>nums.length/3)
            {
                res.add(key);
            }
        }
        return res;
    }
}