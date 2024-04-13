class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length, ans=-1;
        long low,high,mid,target;
        low = 1;
        high = max(nums,n);
        while(low<=high){
            mid = (low+high)/2;
            target = check(nums,mid,n);
            if(target <= threshold){
                ans = (int)mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int check(int[] nums,long mid,int n){
        int result = 0;
        double val;
        for(int i=0;i<n;i++){
            val = (double)nums[i]/(double)mid;
            result += (int) Math.ceil(val);
        }
        return result;
    }
    public int max(int[] nums,int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(maxi < nums[i])
                maxi = nums[i];
        }
        return maxi;
    }
}