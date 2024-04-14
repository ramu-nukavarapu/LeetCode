class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low, high, mid, target, ans=-1;
        low = max(nums,n);
        high = total(nums,n);
        while(low<=high){
            mid = (low+high)/2;
            target = check(nums,mid,n);
            if(target<=k){
                ans = mid;
                high = mid-1;
            }else{
                low =  mid+1;
            }
        }
        return ans;
    }
    
    public int check(int[] nums,int mid,int n){
        int sum = 0, counter = 1;
        for(int i=0;i<n;i++){
            if(sum + nums[i] > mid){
                counter++;
                sum = 0;
            }
            sum = sum + nums[i];
        }
        return counter;
    }
    
    public int max(int[] nums,int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(maxi < nums[i])
                maxi = nums[i];
        }
        return maxi;
    }
    
    public int total(int[] nums,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        return sum;
    }
}