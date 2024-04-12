func minDays(bloomDay []int, m int, k int) int {
    ans := -1
    n := len(bloomDay)
    if(n >= k*m){
        low := min(bloomDay,n)
        high := max(bloomDay,n)
        var mid,target int
        for low<=high{
            mid = (low+high)/2
            target = check(bloomDay,mid,k,n)
            if(target >= m){
                ans = mid
                high = mid-1
            }else{
                low = mid+1
            }
        }
    }
    return ans
}

func check(bd []int,mid int,k int,n int) int{
    counter:=0
    count := 0
    for i:=0;i<n;i++{
        if bd[i] > mid{
            count = count + (counter/k)
            counter = 0
        }else{
            counter++
        }
    }
    count = count + (counter/k)
    return count
}

func max(bd []int,n int) int{
    maxi := math.MinInt64
    for i:=0;i<n;i++{
        if(maxi < bd[i]){
            maxi = bd[i]
        }
    }
    return maxi
}

func min(bd []int,n int) int{
    mini := math.MaxInt64
    for i:=0;i<n;i++{
        if(mini > bd[i]){
            mini = bd[i]
        }
    }
    return mini
}