func majorityElement(nums []int) int {
    var element int = nums[0];
    var count int = 1;
    for i:=0;i<len(nums);i++{
        if(nums[i] == element){
            count++;
        } else {
            count--;
            if(count == 0){
                count = 1;
                element = nums[i];
            }
        }
    }
    return element;
}