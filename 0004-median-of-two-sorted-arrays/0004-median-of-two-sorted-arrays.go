func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
    n1:=len(nums1)
    n2:=len(nums2)
    n := n1+n2
    ind1 := n/2
    ind2 := ind1-1
    var i,j,count,val1,val2 = 0,0,0,0,0
    for i<n1 && j<n2{
        if(nums1[i]<nums2[j]){
            if(count == ind1){
                val1 = nums1[i]
            }
            if(count == ind2){
                val2 = nums1[i]
            }
            i++
        }else{
            if(count == ind1){
                val1 = nums2[j]
            }
            if(count == ind2){
                val2 = nums2[j]
            }
            j++
        }
        count++
    }
    for i<n1{
        if(count == ind1){
            val1 = nums1[i]
        }
        if(count == ind2){
            val2 = nums1[i]
        }
        i++
        count++
    }
    for j<n2{
        if(count == ind1){
            val1 = nums2[j]
        }
        if(count == ind2){
            val2 = nums2[j]
        }
        j++
        count++
    }
    
    if(n%2 == 0){
        return float64(val1+val2)/2.0
    }else{
        return float64(val1)
    }
}