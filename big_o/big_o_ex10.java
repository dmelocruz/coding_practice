// Time complexity: O(sqrt(n))

boolean isPrime(int n){
    for(int x =2; x <= sqrt(n); x++){
        if(n % x == 0){
            return false;
        }
    }
    return true;
}