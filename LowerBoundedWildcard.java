import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    // Method to add integers to a list
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        // Using lower-bounded wildcard with a list of numbers
        List<Number> numbers = new ArrayList<>();
        addIntegers(numbers);
        System.out.println("List of Numbers: " + numbers);
    }
}
