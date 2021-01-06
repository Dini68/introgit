package training.aaa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    public void testStaticHelloMethod() {
        assertEquals("Hello", Example.sayHello());
    }
    @Test
    public void testDefault() {
        A a = new A();
        assertEquals("Example", a.getName());
    }


}