
//Time complexity: O(n^2 * n!s)
void permutation(String str){
    permutation(str, '')
}

void permutation(String str, String prefix){
    if (str.length() == 0){
        Systen.out.println(prefix);
    } else{
        for(int i = 0; i < str.length(); i++){
            String rem = str.substring(0, i) + str.substring(i + 1);
            permutation(rem, prefix + str.charAr(i));
        }
    }
}