class Solution {
    public int fibo(int[] arr, int n)
    {
        if(n>=0 && n<= 30)
        {
            if(arr[n]==0)
                if(n==0 || n==1)
                    return n;
                else
                    return arr[n]=fibo(arr,n-1)+fibo(arr,n-2);
            else 
                return arr[n];
        }
        return 0;
    }
    public int fib(int n) {
        int[] arr = new int[n+1];
        return fibo(arr,n);
    }
}