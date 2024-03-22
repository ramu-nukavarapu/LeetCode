class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid;
        while(start <= end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid-1;
                if(mid-1>-1){
                    if(nums[mid-1] < target){
                        return mid;
                    }
                }
                else{
                    return mid;
                }
            }
            else{
                start = mid+1;
                if(mid+1 < nums.length){
                    if(nums[mid+1] > target){
                        return mid+1;
                    }
                }
                else{
                    return mid+1;
                }
            }
        }
        return -1;
    }
}