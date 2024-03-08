func nextPermutation(nums []int)  {
    var temp int
    if len(nums) <= 2{
        if len(nums) == 2{
            temp = nums[0]
            nums[0] = nums[1]
            nums[1] = temp
        }
    }else{
        index := -1
        for i:=len(nums)-2;i>=0;i--{
            if nums[i] < nums[i+1]{
                index = i
                break
            }
        }
        
        if index == -1{
            sort.Ints(nums)
        }else{
            for i:=len(nums)-1;i>index;i-- {
                if nums[index] < nums[i] {
                    
                    temp = nums[index]
                    nums[index] = nums[i]
                    nums[i] = temp
                    break
                }
            }
            
            index++
            end := len(nums)-1
            
            for index < end {
                temp = nums[index]
                nums[index] = nums[end]
                nums[end] = temp
                index++
                end--
            }            
            
        }
    }
}