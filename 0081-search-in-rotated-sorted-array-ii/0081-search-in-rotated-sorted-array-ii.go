func search(nums []int, target int) bool {
    low := 0
    high := len(nums)-1
    var mid int
    for(low<=high){
        mid = (low+high)/2
        if(nums[mid] == target){
            return true
        }
        if(nums[low] == nums[mid] && nums[high] == nums[mid]){
            low++
            high--
            continue
        }
        
        if(nums[low] <= nums[mid]){
            if(nums[low]<=target && target<=nums[mid]){
                high = mid - 1
            }else{
                low = mid + 1
            }
        }else{
            if(nums[mid]<=target && target<= nums[high]){
                low = mid+1
            }else{
                high = mid-1
            }
        }
    }
    return false
}