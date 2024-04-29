class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = {-1,-1};
        int low=0, high=n-1, col,row,left,right;
        
        while(low<=high){
            col = (low+high)/2;
            row = maxi(mat,col,m);
            
            if(col-1 > 0){
                left = mat[row][col-1];
            }else{
                left = -1;
            }
            
            if(col+1 < n){
                right = mat[row][col+1];
            }else{
                right = -1;
            }
            
            if(left <= mat[row][col] && right <= mat[row][col]){
                arr[0] = row;
                arr[1] = col;
                return arr;
            }else if(left > mat[row][col]){
                high = col-1;
            }else{
                low = col+1;
            }
        }
        return arr;
    }
    public int maxi(int[][] mat, int mid, int m){
        int maxInd = 0;
        for(int i=1;i<m;i++){
            if(mat[maxInd][mid] < mat[i][mid]){
                maxInd = i;
            }
        }
        return maxInd;
    }
    
}