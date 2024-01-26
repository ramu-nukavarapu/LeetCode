class Solution {
    public boolean isPalindrome(String s) {
        
        char[] arr = s.toCharArray();
        for(int i=0,j=arr.length-1;i<j;)
        {
            if(!Character.isLetterOrDigit(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[j])){
                j--;
                continue;
            }
            if(Character.toLowerCase(arr[i])!=Character.toLowerCase(arr[j]))
                return false;
            i++;
            j--;
        }
        return true;
    }
}