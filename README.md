# JavaSE-Generic

Generics in Java allow you to create classes, interfaces, and methods that operate on parameters without committing to a specific data type. 
This enhances code reusability and type safety. Let's take a look at a simple example using a generic class.


```java
// A simple generic class
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> integerBox = new Box<>(10);
        System.out.println("Integer Value: " + integerBox.getContent());

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + stringBox.getContent());
    }
}
```

In this example, Box is a generic class that can hold a value of any data type. 
The generic type parameter ```<T>``` is a placeholder for the actual type that will be specified when an instance of the class is created.

Here's a breakdown of the code:

- ```class Box<T>```: Declares a generic class Box with a type parameter T.

- ```private T content;```: Represents a member variable of type T.

- ```public Box(T content)```: Constructor that takes an argument of type T.

- ```public T getContent()```: Getter method that returns the content of the box.

In the main method:

- ```Box<Integer> integerBox = new Box<>(10);```: Creates an instance of Box with Integer as the generic type.

- ```Box<String> stringBox = new Box<>("Hello, Generics!");```: Creates another instance with String as the generic type.

By using generics, you get the benefit of type checking at compile time, and you can create flexible and reusable components that work with different data types without sacrificing type safety.

## and when using "?" for defining a generic parameter

When you use ? as a generic parameter in Java, it's known as a wildcard. 

There are two types of wildcards: an upper-bounded wildcard (? extends T) and a lower-bounded wildcard (? super T). 

Let's explore both with examples.


### Upper-bounded Wildcard (? extends T):

```java
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
```


