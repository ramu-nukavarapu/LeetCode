class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid;
        while(start <= end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[start]){
                if(nums[mid] >= target && nums[start] <= target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(nums[mid] <= target && nums[end]>=target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}