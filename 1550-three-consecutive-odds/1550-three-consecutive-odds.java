class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length, counter = 0;
        boolean prev = false;
        for(int i=0;i<n;i++){
            if(prev == false){
                counter = 0;
            }
            
            if(arr[i]%2 == 1){
                counter++;
                prev = true;
            }else{
                prev = false;
            }
            
            if(counter == 3){
                return true;
            }
        }
        return false;
    }
}
