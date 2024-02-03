class Solution {
    public boolean check(int[] nums) {
        if(sort(nums)){
            return true;   
        }
        else {
            int k = nums.length;
            while(k>0)
            {
                if(rotate(nums))
                    return true;
                else{
                    k--;
                }
            }
            return false;
        }  
    }
    public boolean rotate(int[] nums)
    {
        int val = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
        {
            nums[i] = nums[i-1];
        }
        nums[0] = val;
        return sort(nums);
    }
    public boolean sort(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i+1])
                return false;
        }
        return true;
    }
}