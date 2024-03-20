class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,temp;
        while(i<m && j<n){
            if(nums1[i] > nums2[j]){
                temp = nums2[j];
                nums2[j] = nums1[i];
                nums1[i] = temp;
                Arrays.sort(nums2);
                i++;
            }
            else{
                i++;
            }
        }
        
        if(j<n){
            while(i<m+n){
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
        
    }

}
