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


