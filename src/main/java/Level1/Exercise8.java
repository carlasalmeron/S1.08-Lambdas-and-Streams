package Level1;

@FunctionalInterface
interface ReverseInterface {
    String reverse(String str);
}

public class Exercise8 {
    public static void main(String[] args) {
        ReverseInterface reverser = (str) -> new StringBuilder(str).reverse().toString();

        String input = "Hello World";
        String result = reverser.reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }
}
