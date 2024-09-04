
import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /**
     * Returns the total sum of the elements in the list.
     * If the list is empty, returns 0.
     */
    public static int sum(List<Integer> L) {
        int total = 0;
        for (Integer num : L) {
            total += num;
        }
        return total;
    }

    /**
     * Returns a new list containing the even numbers from the given list.
     * If there are no even elements, returns an empty list.
     */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer num : L) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    /**
     * Returns a new list containing the items present in both of the two given lists.
     * If there are no common items, returns an empty list.
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonList = new ArrayList<>();
        for (Integer item : L1) {
            if (L2.contains(item) && !commonList.contains(item)) {
                commonList.add(item);
            }
        }
        return commonList;
    }

    /**
     * Returns the number of occurrences of the given character in a list of strings.
     * If the character does not occur in any of the words, returns 0.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

}
