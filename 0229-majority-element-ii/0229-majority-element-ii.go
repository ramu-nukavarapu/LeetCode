func majorityElement(nums []int) []int {
    count1 := 0
    count2 := 0
    num1 := math.MinInt64;
    num2 := math.MinInt64;
    
    for i:=0;i<len(nums);i++{
        if(count1 == 0 && nums[i]!=num2){
            count1 = 1
            num1 = nums[i]
        }else if(count2 == 0 && nums[i]!=num1){
            count2 = 1
            num2 = nums[i]
        }else if(nums[i] == num1){
            count1++
        }else if(nums[i] == num2){
            count2++
        }else{
            count1--;
            count2--;
        }
    }
    
    count1 = 0
    count2 = 0
    for i:=0;i<len(nums);i++{
        if(nums[i] == num1){
            count1++
        }else if(nums[i] == num2){
            count2++
        }
    }
    
    var list = []int {}
    if count1 > len(nums)/3{
        list = append(list,num1)
    }
    if count2 > len(nums)/3{
        list = append(list,num2)
    }
    return list
}