import java.util.List;

public class UpperBoundedWildcard {
    // Method to calculate the sum of numbers in a list
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Using upper-bounded wildcard with a list of integers
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of Integers: " + sumOfList(integers));

        // Using upper-bounded wildcard with a list of doubles
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        System.out.println("Sum of Doubles: " + sumOfList(doubles));
    }
}
