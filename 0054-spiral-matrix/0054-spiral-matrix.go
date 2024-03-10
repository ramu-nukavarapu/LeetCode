func spiralOrder(matrix [][]int) []int {
    var list = make([]int,(len(matrix)*len(matrix[0])))
    var index int = 0
    
    top:=0
    left:=0
    right:=len(matrix[0])-1
    bottom:=len(matrix)-1
 
    for top<=bottom && left<=right{
        for i:=left;i<=right;i++{
            list[index] = matrix[top][i]
            index++
        }
        top++
        
        if(!(top<=bottom && left<=right)){
            return list
        }
        for i:=top;i<=bottom;i++{
            list[index] = matrix[i][right]
            index++
        }
        right--
        
        if(!(top<=bottom && left<=right)){
            return list
        }
        for i:=right;i>=left;i--{
            list[index] = matrix[bottom][i]
            index++
        }
        bottom--
        
        if(!(top<=bottom && left<=right)){
            return list
        }
        for i:=bottom;i>=top;i--{
            list[index] = matrix[i][left]
            index++
        }
        left++
    }
    return list
}