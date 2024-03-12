class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0,num1=Integer.MIN_VALUE,num2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1 == 0  && nums[i] != num2){
                count1=1;
                num1 = nums[i];
            }
            else if(count2 == 0  && nums[i] != num1){
                count2=1;
                num2 = nums[i];
            }
            else if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(count1 > nums.length/3){
            list.add(num1);
        }
        if(count2 > nums.length/3){
            list.add(num2);
        }
        return list;
    }
}