class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[k];
        int[] temp=new int[nums.length];
        if(nums.length > k){
            
            for(int i=nums.length-k,j=0;i<nums.length;i++,j++) {
                arr[j] = nums[i];
            }

            for(int i=0;i<k;i++) {
                temp[i] = arr[i];
            }

            for(int i=k,j=0;i<nums.length;i++,j++){
                temp[i] = nums[j];
            }

            for(int i=0;i<nums.length;i++){
                nums[i] = temp[i];
            }
        
        }
        else{
            while(k>0)
            {
                rotates(nums);
                k--;
            }
        }
    }
    public void rotates(int[] nums){
        int temp = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
            nums[i] = nums[i-1];
        nums[0] = temp;
    }
}