// Time complexity: O(b)

int power(int a,int b){
    if(b<0){
        return 0;
    }
    else if (b == 0){
        return 1;
    }
    else if(){
        return a * power(a, b-1);
    }
}