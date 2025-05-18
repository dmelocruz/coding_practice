public class big_o_ex4{
    public static void  printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }
    public static void main (String[] args){
        int[] inputArray1 = {1, 2, 3};
        int[] inputArray2 = {1, 2, 3};

        printUnorderedPairs (inputArray1, inputArray2);
    }
}