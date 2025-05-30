// Time Complexity: O(sqrt(n))

int sqrt(int n){
    for(int guess = 1; gues * guess <= n; gues++){
        if(guess * guess == n){
            return guess;
        }
    }
    return -1;
}