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
        if((nums[mid] != nums[mid-1]) && (nums[mid] != nums[mid+1])){
            return nums[mid]
        }
        if((mid%2 == 0 && nums[mid+1]==nums[mid]) || (mid%2==1 && nums[mid-1]==nums[mid])){
            low = mid+1
        }else{
            high = mid-1
        }
    }
    return -1
}