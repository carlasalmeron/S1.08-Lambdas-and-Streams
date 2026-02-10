package Level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "lemon", "kiwi", "grape", "avocado", "coconut");

        System.out.println("Original list: " + words);

        List<String> filteredWords = filterWordsWithOAndLongerThanFive(words);

        System.out.println("Words containing 'o' and longer than 5 letters: " + filteredWords);
    }

    public static List<String> filterWordsWithOAndLongerThanFive(List<String> input) {
        return input.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
    }
}
