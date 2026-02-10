package Level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("Apple", 123, "Banana", 45, "Kiwi", "Strawberry", 7);

        list.sort(Comparator.comparing((Object obj) -> obj.toString().length()).reversed());

        System.out.println("Sorted by length (longest to shortest):");
        list.forEach(System.out::println);
    }
}
