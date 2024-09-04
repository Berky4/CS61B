import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        if ("Ergun".equals(customer)) {
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if ("Erik".equals(customer)) {
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        } else {
            return new String[3]; // Returns an array of size 3 with all elements initialized to null.
        }
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // Add the current number to the list
        list.add(x);
        
        // Base case: if x is 1, return the list
        if (x == 1) {
            return list;
        }
        
        // Recursive case: compute the next number in the sequence
        if (x % 2 == 0) {
            return hailstoneHelper(x / 2, list);
        } else {
            return hailstoneHelper(x * 3 + 1, list);
        }
    }

    public static void main(String[] args) {
        // Test cases for the methods
        System.out.println("makeDice: ");
        for (int num : makeDice()) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("takeOrder for Ergun: ");
        for (String item : takeOrder("Ergun")) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("takeOrder for Erik: ");
        for (String item : takeOrder("Erik")) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("takeOrder for unknown customer: ");
        for (String item : takeOrder("Unknown")) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("findMinMax: ");
        int[] array = {5, 1, 9, 3, 7};
        System.out.println(findMinMax(array));

        System.out.println("hailstone sequence for 7: ");
        List<Integer> sequence = hailstone(7);
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
