class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                if(i!=j){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int start,end;
        for(int i=0;i<matrix.length;i++){
            start = 0;
            end = matrix[i].length-1;
            while(start < end){
                temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}