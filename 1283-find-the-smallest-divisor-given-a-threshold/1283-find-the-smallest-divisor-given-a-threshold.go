func smallestDivisor(nums []int, threshold int) int {
    n := len(nums)
    ans := -1
    low := 1
    high := max(nums,n)
    var mid,target int
    for low<=high{
        mid = (low+high)/2
        target = check(nums,mid,n)
        if target <= threshold{
            ans = mid
            high = mid-1
        }else{
            low = mid+1
        }
    }
    return ans;
}

func check(nums []int,mid int,n int) int{
    result := 0
    var val float64
    for i:=0;i<n;i++{
        val = float64(nums[i])/float64(mid)
        result = result + int(math.Ceil(val))
    }
    return result
}

func max(nums []int,n int) int{
    maxi := math.MinInt64
    for i:=0;i<n;i++{
        if(maxi < nums[i]){
            maxi = nums[i]
        }
    }
    return maxi
}