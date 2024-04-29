func findPeakGrid(mat [][]int) []int {
    n := len(mat)
    m := len(mat[0])
    
    arr := []int{-1,-1}
    low,high := 0,m-1
    var row,col,left,right int
    
    for(low<=high){
        col = (low+high)/2
        row = maxi(mat,col,n)
        
        if(col-1 >= 0){
            left = mat[row][col-1]
        }else{
            left = -1
        }
        
        if(col+1 < m){
            right = mat[row][col+1]
        }else{
            right = -1
        }
        
        if(left <= mat[row][col] && right <= mat[row][col]){
            arr[0] = row
            arr[1] = col
            return arr
        }else if(mat[row][col] < left){
            high = col-1
        }else{
            low = col+1
        }
    }
    return arr
}

func maxi(mat [][]int, col int, n int) int{
    max := 0
    for i:=1;i<n;i++ {
        if(mat[max][col] < mat[i][col]){
            max = i
        }
    }
    return max
}