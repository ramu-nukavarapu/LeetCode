class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(piles[i] > high){
                high = piles[i];
            }
        }
        
        long low = 1, mid, ans=high;
        boolean target;
        while(low<=high){
            mid = (low+high)/2;
            target = count(piles,mid,h,n);
            if(target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)ans;
    }
    public boolean count(int[] piles,long mid,int h,int n){
        long result=0;
        double val;
        for(int i=0;i<n;i++){
            val = (double)piles[i] / (double)mid;
            result += (int) Math.ceil(val);
        }
        if(result <= h){
            return true;
        }else{
            return false;
        }
    }
}