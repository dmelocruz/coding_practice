// Time complexity: O(a/b)
// variable count will eventually equal a/b. 
// while loop iterate 'count' times, therefore a/b times

int div(int a, int b){
    int count = 0;
    int sum = b;
    while(sum <= a){
        sum += b;
        count++;
    }
    return count;
}