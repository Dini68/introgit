package training.constructoroverloading;

public class Trainer {

    private String name;

    private int age;

    public Trainer() {
        this("Anonymus");
    }

    public Trainer(String name) {
        this(name, 20);
    }

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
