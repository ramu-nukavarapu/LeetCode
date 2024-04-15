class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int lowcol = 0, highcol = m-1;
        int midcol, midrow;
        while(lowcol <= highcol){
            midcol = (lowcol+highcol)/2;
            if(matrix[midcol][0] > target){
                highcol = midcol-1;
                continue;
            }
            int lowrow = 0, highrow = n-1;
            while(lowrow <= highrow){
                midrow = (lowrow+highrow)/2;
                if(matrix[midcol][midrow] == target)
                    return true;
                else if(matrix[midcol][midrow] < target)
                    lowrow = midrow+1;
                else
                    highrow = midrow-1;
            }
            if(matrix[midcol][n-1] > target){
                break;
            }else{
                lowcol = midcol+1;
            }   
        }
        return false;
    }
}