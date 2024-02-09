func singleNumber(nums []int) int {
    if len(nums) == 1 {
        return nums[0]
    }else {
        result := 0
        for i:=0;i<len(nums);i++ {
            result ^= nums[i]
        }
        return result
    }
}