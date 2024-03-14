class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> bigList = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1] == nums[i])
                continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j-1] == nums[j])
                    continue;
                int k = j+1;
                int l = n-1;
                int prevK = Integer.MIN_VALUE;
                int prevL = Integer.MAX_VALUE;
                while(k<l){
                    if(nums[k] == prevK)
                        k++;
                    else if(nums[l] == prevL)
                        l--;
                    else{
                        long sum = nums[i];
                         sum += nums[j]; 
                         sum += nums[k]; 
                         sum += nums[l];
                        if(sum == target){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            bigList.add(list);
                            prevK = nums[k];
                            prevL = nums[l];
                            k++;
                            l--;
                        }
                        else if(sum > target){
                            l--;
                        }
                        else if(sum < target){
                            k++;
                        }
                    }
                }
            }
        }
        return bigList;
    }
}