package Level1;

@FunctionalInterface
interface PiInterface {
    double getPiValue();
}

public class Exercise5 {
    public static void main(String[] args) {

        PiInterface pi = () -> 3.1415;

        System.out.println("The value of Pi is: " + pi.getPiValue());
    }
}
