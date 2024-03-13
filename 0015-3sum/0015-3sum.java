class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> bigList = new ArrayList<>();
        Arrays.sort(nums);
        int prevI = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != prevI){
                int j = i+1;
                int k = nums.length-1;
                int prevJ = Integer.MIN_VALUE;
                int prevK = Integer.MAX_VALUE;
                while(j<k){
                    if(nums[j] == prevJ){
                        j++;
                    }
                    else if(nums[k] == prevK){
                        k--;
                    }
                    else{
                        if(nums[i] + nums[j] + nums[k] == 0){
                            prevI = nums[i];
                            prevJ = nums[j];
                            prevK = nums[k];
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            bigList.add(list);
                            j++;
                            k--;
                        }
                        else if(nums[i] + nums[j] + nums[k] > 0){
                            k--;
                        }
                        else if(nums[i] + nums[j] + nums[k] < 0){
                            j++;
                        }
                    }
                    
                }
            }
            
        }
        return bigList;
    }
}