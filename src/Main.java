import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Git individual exercise demo");

        // For now we just call both methods to show the features.
        sortInts();
        sortStrings();
    }

    // Feature 1: sort a list of integers in ascending order
    public static void sortInts() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        System.out.println("Integers before sort: " + numbers);
        Collections.sort(numbers);
        System.out.println("Integers after sort:  " + numbers);
    }

    // Feature 2: sort a list of strings in alphabetical order
    public static void sortStrings() {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("date");

        System.out.println("Strings before sort: " + words);
        Collections.sort(words);
        System.out.println("Strings after sort:  " + words);
    }
}
