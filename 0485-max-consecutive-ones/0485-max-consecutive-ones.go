func findMaxConsecutiveOnes(nums []int) int {
    count := 0
    maxCount := 0
    for _,val := range nums {
        if val==1 {
            count++;
            if count > maxCount{
                maxCount = count;
            }
        }else{
            count=0;
        }
    }
    return maxCount
}