class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans = -1, n = bloomDay.length;
        if(n >= k*m){
            int low , high, mid;
            boolean target;
            low = min(bloomDay,n);
            high = max(bloomDay,n);
            while(low <= high){
                mid = (low+high)/2;
                target = check(bloomDay,mid,m,k,n);
                if(target){
                    ans = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return ans;
    }
    public boolean check(int[] bd,int mid,int m,int k,int n){
        int count=0,c=0;
        for(int i=0;i<n;i++){
            if(bd[i] > mid){
                c = c+(count/k);
                count = 0;
            }else{
                count++;
            }
        }
        c = c+(count/k);
        if(c>=m){
            return true;
        }else{
            return false;
        }
    }
    
    public int max(int[] bD, int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(maxi < bD[i])
                maxi = bD[i];
        }
        return maxi;
    }
    public int min(int[] bD, int n){
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(mini > bD[i])
                mini = bD[i];
        }
        return mini;
    }
}