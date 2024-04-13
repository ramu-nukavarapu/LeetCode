func shipWithinDays(weights []int, days int) int {
    ans := -1
    n := len(weights)
    
    low := max(weights,n)
    high := totalSum(weights,n)
    
    var mid,target int
    
    for low<=high{
        mid = (low+high)/2
        target = check(weights, mid, n)
        if(target<=days){
            ans = mid
            high = mid-1
        }else{
            low = mid+1
        }
    }
    return ans
}

func check(weights []int,mid int,n int) int{
    days := 1
    weight := 0
    for i:=0;i<n;i++{
        if(weight+weights[i] > mid){
            days++
            weight = 0
        }
        weight = weight + weights[i]
    }
    return days
}

func totalSum(weights []int,n int) int{
    total := 0
    for i:=0;i<n;i++{
        total = total + weights[i]
    }
    return total
}

func max(weights []int,n int) int{
    maxi := math.MinInt64
    for i:=0;i<n;i++{
        if(maxi < weights[i]){
            maxi = weights[i]
        }
    }
    return maxi
}