// Time complexity: O(n^2)

public class big_o_ex3{
    public static void printUnorderedPairs(int [] array){
        for (int i=0; i< array.length; i++){
            for(int j = i+1; j < array.length; j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    public static void main(String[] args){
        int [] inputArray = {1, 2, 3};
        printUnorderedPairs(inputArray);
    }
}