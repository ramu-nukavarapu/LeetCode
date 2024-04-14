class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length-1, mid, missing;
        while(low<=high){
            mid = (low+high)/2;
            missing = arr[mid]-(mid+1);
            if(missing < k)
                low = mid+1;
            else
                high = mid-1;
        }
        return low+k;
    }
}