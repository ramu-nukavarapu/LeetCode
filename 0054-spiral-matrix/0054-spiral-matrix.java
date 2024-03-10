class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            if(!(top<=bottom && left<=right))
                return list;
            
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(!(top<=bottom && left<=right))
                return list;
            
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(!(top<=bottom && left<=right))
                return list;
            
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            
        }
        return list;
    }
}