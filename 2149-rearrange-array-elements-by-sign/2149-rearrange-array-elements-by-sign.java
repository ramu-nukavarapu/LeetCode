class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp[] = new int[nums.length];
        int pos = 0,neg = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                temp[pos] = nums[i];
                pos=pos+2;
            }
            else{
                temp[neg] = nums[i];
                neg=neg+2;
            }
        }
        nums = temp;
        return nums;
    }
}