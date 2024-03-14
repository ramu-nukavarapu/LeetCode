func fourSum(nums []int, target int) [][]int {
    sort.Ints(nums)
    var bigList = [][] int {}
    n := len(nums)
    for i:=0;i<n;i++ {
        if(i>0 && nums[i-1] == nums[i]){
            continue
        }
        
        for j:=i+1;j<n;j++{
            if(j>i+1 && nums[j-1] == nums[j]){
                continue
            }
            k:=j+1
            l:=n-1
            prevk := math.MinInt64
            prevl := math.MinInt64
            for(k<l){
                if(prevk == nums[k]){
                    k++
                }else if(prevl == nums[l]){
                    l--
                }else{
                    sum := nums[i]+nums[j]+nums[k]+nums[l]
                    if(sum == target){
                        list := []int{}
                        list = append(list,nums[i],nums[j],nums[k],nums[l])
                        bigList = append(bigList,list)
                        prevk = nums[k]
                        prevl = nums[l]
                        k++
                        l--
                    }else if(sum > target){
                        l--
                    }else{
                        k++
                    }
                }
            }
        }
    }
    
    return bigList
}