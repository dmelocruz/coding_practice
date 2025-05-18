// Time Complexity: O(n^2)

public class big_o_ex2{
    public static void printPairs(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    public static void main(String[] args){
        int [] inputArray = {1, 2, 3};
        printPairs(inputArray);
    }
}