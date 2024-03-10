func rotate(matrix [][]int)  {
    var temp int
    for i:=0;i<len(matrix);i++{
        for j:=i;j<len(matrix[i]);j++{
            temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
    
    var start,end int
    for i:=0;i<len(matrix);i++{
        start = 0
        end = len(matrix[0])-1
        for start<end{
            temp = matrix[i][start]
            matrix[i][start] = matrix[i][end]
            matrix[i][end] = temp
            start++;
            end--;
        }
    }
}