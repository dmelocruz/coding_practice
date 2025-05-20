//Time complexity: O(A* b * 1000) -> O(A*B)

public class big_o_ex5 {
    public static void main(String[] args) {
        int [] inputArrayA = {1, 2, 3, 4, 5};
        int [] inputArrayB = {1, 2, 3, 4, 5};
        printUnorderedPairs(inputArrayA, inputArrayB);
    }

    // O(n) time complexity
    public static void printUnorderedPairs(int [] ArrayA, int [] ArrayB) {
        
        for (int i = 0; i < ArrayA.length; i++) {
            for (int j = 0; j < ArrayB.length; j++) {
                for(int k = 0; k < 10000; k++) {
                    System.out.println("Pair: " + ArrayA[i] + ", " + ArrayB[j]);
                }
            }
        }
        
    }
}