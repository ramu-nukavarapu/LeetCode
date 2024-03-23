class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int count=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                count = i;
                break;
            }
        }
        if(count != -1){
            arr[0] = count;
            for(int i=count;i<nums.length;i++){
                if(nums[i]!=target){
                    break;
                }
                count++;
            }
            arr[1] = count-1;
        }
        return arr;
    }
}