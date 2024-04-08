func findMin(nums []int) int {
    low := 0
    high := len(nums)-1
    min := math.MaxInt64
    var mid int
    for low <= high {
        mid = (low+high)/2
        if(nums[low] <= nums[mid]){
            if(nums[low] < min){
                min = nums[low]
            }
            low = mid+1
        }else{
            if(nums[mid] < min){
                min = nums[mid]
            }
            high = mid-1;
        }
    }
    return min;
}