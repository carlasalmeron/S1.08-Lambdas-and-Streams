package Level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "lemon", "kiwi", "grape", "avocado");

        System.out.println("Original list: " + words);

        List<String> wordsWithO = filterWordsWithO(words);

        System.out.println("Words containing 'o': " + wordsWithO);
    }

    public static List<String> filterWordsWithO(List<String> input) {
        return input.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
