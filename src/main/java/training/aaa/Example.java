package training.aaa;

public interface Example {

    static String sayHello() {
        return "Hello";
    }

    default String getName() {
        return "Example";
    }
}
