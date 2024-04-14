func splitArray(nums []int, k int) int {
    n := len(nums)
    ans := -1
    low := max(nums,n)
    high := total(nums,n)
    var mid,target int
    for low<=high{
        mid = (low+high)/2
        target = check(nums,mid,n)
        if(target<=k){
            ans = mid
            high = mid-1
        }else{
            low = mid+1
        }
    }
    return ans
}

func check(nums []int,mid int,n int) int{
    counter := 1
    sum := 0
    for i:=0;i<n;i++{
        if sum+nums[i] > mid{
            counter++
            sum = 0
        }
        sum = sum + nums[i]
    }
    return counter
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

func total(nums []int,n int) int{
    sum := 0
    for i:=0;i<n;i++{
        sum = sum + nums[i]
    }
    return sum
}