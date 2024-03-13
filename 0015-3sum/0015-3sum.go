
func threeSum(nums []int) [][]int {
    var bigList = [][]int{}
    previ := math.MinInt64
    sort.Ints(nums)
    for i:=0;i<len(nums);i++{
        if(nums[i] != previ){
            j:=i+1
            k:=len(nums)-1
            prevj := math.MinInt64
            prevk := math.MaxInt64

            for j<k{
                if(prevj == nums[j]){
                    j++
                }else if(prevk == nums[k]){
                    k--
                }else{
                    if(nums[i] + nums[j] + nums[k] == 0){
                        var list = make([]int,3)
                        
                        list[0] = nums[i]
                        list[1] = nums[j]
                        list[2] = nums[k]
                        
                        previ = nums[i]
                        prevj = nums[j]
                        prevk = nums[k]
                        bigList = append(bigList,list)
                        j++
                        k--
                    }else if(nums[i] + nums[j] + nums[k] > 0){
                        k--
                    }else if(nums[i] + nums[j] + nums[k] < 0){
                        j++
                    }
                }
            }    
        }
    }
    return bigList
}