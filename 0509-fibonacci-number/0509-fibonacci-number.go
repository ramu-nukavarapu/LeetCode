func fib(n int) int {
    arr := make([]int,n+1)
    return fibo(arr,n)
}
func fibo(arr[] int, n int) int {
    if(arr[n] == 0){
        if(n==0 || n==1){
            return n
        }else{
            arr[n]=fibo(arr,n-1)+fibo(arr,n-2)
            return arr[n]
        }
    }else{
        return arr[n]
    }
    
}