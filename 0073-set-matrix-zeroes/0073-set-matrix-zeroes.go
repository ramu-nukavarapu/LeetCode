func setZeroes(matrix [][]int)  {
    var row = make([]int,len(matrix[0]))
    var column = make([]int,len(matrix))
    
    for i:=0;i<len(matrix);i++{
        for j:=0;j<len(matrix[0]);j++{
            if(matrix[i][j] == 0){
                row[j] = 1
                column[i] = 1 
            }
        }
    }
    
    for i:=0;i<len(matrix);i++{
        for j:=0;j<len(matrix[0]);j++{
            if(row[j] == 1 || column[i] == 1 ){
                matrix[i][j] = 0
            }
        }
    }
}