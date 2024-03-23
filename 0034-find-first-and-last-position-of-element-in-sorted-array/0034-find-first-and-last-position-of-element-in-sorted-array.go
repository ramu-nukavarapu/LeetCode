func searchRange(nums []int, target int) []int {
    count := -1
    arr := []int{-1,-1}
    for i:=0;i<len(nums);i++{
        if(nums[i] == target){
            count = i
            break
        }
    }
    if(count != -1){
        arr[0] = count
        for i:=count;i<len(nums);i++{
            if(nums[i]!=target){
                break
            }
            count++
        }
        arr[1] = count-1
    }
    return arr
}