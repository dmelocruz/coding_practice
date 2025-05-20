// Time complexity: O(n) -> O(n/2) = O(n)

public class big_o_ex6 {
    public static void main(String[] args) {
        int [] inputArray = {1, 2, 3, 4, 5};
        reverse(inputArray);
    }

    public static void reverse(int[] array){
        for (int i=0; i<array.length/2; i++){
            
            System.out.println("===RUN===");

            int tail_index = array.length - i - 1;
            int head = array[i];

            System.out.println("array[tail]" + array[tail_index]);
            System.out.println("head:" + head);
            printArray(array);
            
            array[i] = array[tail_index];
            array[tail_index] = head;

            printArray(array);
            System.out.println();
        }
    }

    public static void printArray(int [] inputArray){
        for (int i=0; i<inputArray.length; i++){
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}