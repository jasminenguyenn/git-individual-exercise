import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Git individual exercise demo");

        // I call both features here so I can see them run together
        sortInts();
        sortStrings();
    }

    // This feature is about sorting integers
    // I use a simple ArrayList and Collections.sort to keep it easy to understand
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

    // This feature is about sorting strings
    // I keep the list short so it’s easy to see the order change
    // I also use Collections.sort here to put the words in alphabetical order
    public static void sortStrings() {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("date");

        System.out.println("Strings before sort: " + words);
        Collections.sort(words);
        System.out.println("Strings after sort:  " + words);
        System.out.println("Finished running both features!");



    }
}
