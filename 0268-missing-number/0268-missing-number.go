func missingNumber(nums []int) int {
    n:=len(nums);
    sum1:=(n*(n+1))/2;
    sum2:=0;
    for _,val := range nums{
        sum2 += val;
    }
    return sum1-sum2
}