func maxProfit(prices []int) int {
    var maxProfit = 0
    var min = math.MaxInt64;
    
    for i:=0;i<len(prices);i++ {
        if min > prices[i] {
            min = prices[i]
        }
        if prices[i] - min > maxProfit {
            maxProfit = prices[i] - min
        }
    }
    
    return maxProfit
}