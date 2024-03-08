func rearrangeArray(nums []int) []int {
    var temp = make([]int, len(nums))
    pos := 0
    neg := 1
    
    for i:=0;i<len(nums);i++ {
        if nums[i] > 0{
            temp[pos] = nums[i]
            pos+=2
        }else{
            temp[neg] = nums[i]
            neg+=2
        }
    }
    nums = temp
    return nums
}