class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                j=i+1;
                break;
            }
        }
        if(j!=-1){
            int temp;
            while(j<nums.length){
                if(nums[j]!=0){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
        }
    }
}