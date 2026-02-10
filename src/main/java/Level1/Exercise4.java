package Level1;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        System.out.println("Printing months using Method Reference:");
        months.forEach(System.out::println);
    }
}
