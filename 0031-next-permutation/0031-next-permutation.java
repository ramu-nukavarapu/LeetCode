class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length > 2){
            int prefix=-1;
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i] < nums[i+1]){
                    prefix = i;
                    break;
                }
            }
            if(prefix == -1){
                Arrays.sort(nums);
            }
            else{
                int temp;
                for(int i=nums.length-1;i>prefix;i--){
                    if(nums[prefix] < nums[i]){
                        temp = nums[prefix];
                        nums[prefix] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
                prefix++;
                int end = nums.length-1;
                while(prefix < end){
                    temp = nums[prefix];
                    nums[prefix] = nums[end];
                    nums[end] = temp;
                    prefix++;
                    end--;
                }
            }
        }
        else{
            if(nums.length == 2){
                int temp;
                temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
        }
    }
}
