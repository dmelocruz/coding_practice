// Time Complexity: O(branches^depth)
// 2 branches per call, go as deep as n
// O(2^n)

int fib(int n){
    if(n <= 0) return 0;
    else if (n == 1) return 1;
    return fib(n-1) + fib(n-2)
}