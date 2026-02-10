package Level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("Apple", 123, "Banana", 45, "Kiwi", "Strawberry", 7);

        list.sort(Comparator.comparing(obj -> obj.toString().length()));

        System.out.println("Sorted by length (shortest to longest):");
        list.forEach(System.out::println);
    }
}
