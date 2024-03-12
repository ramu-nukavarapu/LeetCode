func generate(numRows int) [][]int {
    var bigList = [][]int {}
    index := 0
    for i:=1;i<=numRows;i++{
        var list = make([]int,i)
        for j:=0;j<i;j++{
            if(j==0 || j== i-1){
                list[j] = 1
            }else{
                list[j] =  bigList[index-1][j-1] + bigList[index-1][j]
            }
        }
        bigList = append(bigList,list)
        index++
    }
    return bigList
}