class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int ans= -1, low, high, mid, target;
        low = max(weights,n);
        high = totalSum(weights,n);
        while(low <= high){
            mid =(low+high)/2;
            target = check(weights,mid,n);
            if(target<=days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    
    public int check(int[] weights,int mid,int n){
        int days = 1, weight = 0;
        for(int i=0;i<n;i++){
            if(weight+weights[i] > mid){
                days++;
                weight = 0;
            }
            weight += weights[i];
        }
        return days;
    }
    
    public int  totalSum(int[] arr,int n){
        int total = 0;
        for(int i=0;i<n;i++){
            total += arr[i];
        }
        return total;
    }
    
    public int max(int[] arr,int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(maxi < arr[i])
                maxi = arr[i];
        }
        return maxi;
    }
}