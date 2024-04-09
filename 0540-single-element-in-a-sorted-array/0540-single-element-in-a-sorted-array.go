func singleNonDuplicate(nums []int) int {
    if(len(nums) == 1){
        return nums[0]
    }
    if(nums[0] != nums[1]){
        return nums[0]
    }
    if(nums[len(nums)-2] != nums[len(nums)-1]){
        return nums[len(nums)-1]
    }
    
    low := 1
    high := len(nums)-2
    var mid int
    for(low<=high){
        mid=(low+high)/2
        if(mid%2 == 0){
            if(nums[mid+1]==nums[mid]){
                low = mid+1
            }else if(nums[mid-1]==nums[mid]){
                high = mid-1
            }else{
                return nums[mid]
            }
        }else{
            if(nums[mid+1]==nums[mid]){
                high = mid-1
            }else if(nums[mid-1]==nums[mid]){
                low = mid+1
            }else{
                return nums[mid]
            }
            
        }
    }
    return nums[mid]
}