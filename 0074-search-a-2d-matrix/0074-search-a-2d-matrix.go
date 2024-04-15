func searchMatrix(matrix [][]int, target int) bool {
    m:= len(matrix)
    n := len(matrix[0])
    lowcol,highcol := 0,m-1
    var midcol,midrow,lowrow,highrow int
    
    for(lowcol <= highcol){
        midcol = (lowcol+highcol)/2
        if(matrix[midcol][0] > target){
            highcol = midcol-1
            continue
        }
        
        lowrow,highrow = 0,n-1
        for(lowrow<=highrow){
            midrow = (lowrow+highrow)/2
            if(matrix[midcol][midrow] == target){
                return true
            }else if(matrix[midcol][midrow] < target){
                lowrow = midrow+1
            }else{
                highrow = midrow-1
            }
        }
        
        if(matrix[midcol][n-1] > target){
            break
        }else{
            lowcol = midcol+1
        }
    }
    return false
}