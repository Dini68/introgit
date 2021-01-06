package training.aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trainer extends Human implements Work{

    private String name;

    private List<Course> courses = new ArrayList<>();

    public Trainer(int age, String name, List<Course> courses) {
        super(age);
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean doWork() {
        return false;
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer(60, "John Doe", Arrays.asList(new Course("Course1")));

        System.out.println(trainer instanceof Trainer);
        System.out.println(trainer instanceof Object);
        System.out.println(trainer instanceof Human);
        System.out.println(trainer instanceof Work);
    }
}
