func minEatingSpeed(piles []int, h int) int {
    high := math.MinInt64
    n := len(piles)
    for i:=0; i<n;i++{
        if(piles[i] > high){
            high = piles[i]
        }
    }
    
    low := 1
    var mid int
    ans := high
    var target bool
    
    for low <= high{
        mid = (low+high)/2
        target = count(piles,mid,h)
        if(target){
            ans = mid
            high = mid-1
        }else{
            low = mid+1
        }
    }
    return ans
}

func count(piles []int,mid int,h int) bool {
    var result int
    var val float64
    for i:=0;i<len(piles);i++ {
        val = float64(piles[i])/float64(mid)
        result += int(math.Ceil(val))
    }
    
    if(h >= result){
        return true
    }else{
        return false
    }
}