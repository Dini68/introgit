package training.inheritancemethods;

public class Grizzly extends Bear{

    public void speak() {               // Override
        System.out.println("Grizzly growls.");
    }

    public void sleep(int length) {     // Overload
        System.out.println("Grizzly is sleeping for " + length + " hours.");
    }

    public void eat() {              // Hide
        System.out.println("Grizzly is eating.");
        return;
    }

    public static void main(String[] args) {
        Grizzly grizzly = new Grizzly();
        grizzly.hunt();             // Bear is hunting. Bear is eating.
        grizzly.sleep();            // Bear is sleeping.
        grizzly.sleep(10);          // Grizzly is sleeping for 10 hours.
        grizzly.speak();            // Grizzly growls.
        grizzly.eat();              // Grizzly is eating.
    }
}
