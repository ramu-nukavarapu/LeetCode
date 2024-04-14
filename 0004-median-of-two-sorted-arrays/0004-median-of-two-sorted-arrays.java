class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1+n2;
        int ind1 = n/2, ind2 = ind1-1;
        int val1=0,val2=0,count=0,i=0,j=0;
        
        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j]){
                if(count == ind1){
                    val1 = nums1[i];
                }
                if(count == ind2){
                    val2 = nums1[i];
                }
                i++;
            }else{
                if(count == ind1){
                    val1 = nums2[j];
                }
                if(count == ind2){
                    val2 = nums2[j];
                }
                j++;
            }
            count++;
        }
        while(i<n1){
            if(count == ind1){
                val1 = nums1[i];
            }
            if(count == ind2){
                val2 = nums1[i];
            }
            i++;
            count++;
        }
        while(j<n2){
            if(count == ind1){
                val1 = nums2[j];
            }
            if(count == ind2){
                val2 = nums2[j];
            }
            j++;
            count++;
        }
        
        if(n%2 == 0){
            return (double)(val1+val2)/2.0;
        }else{
            return (double)val1;
        }
    }
}