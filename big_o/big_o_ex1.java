//Time complexity: O(n) -> O(2n) = O(n)

public class big_o_ex1{
    public static void foo(int[] array){
        int sum = 0;
        int product = 1;
        for(int i= 0; i<  array.length; i++){
            sum += array[i];
        }
        for(int i = 0; i< array.length; i++){
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
    public static void main(String[] args){
        int [] inputArray = {1,2,3};
        foo(inputArray);
    }
}
