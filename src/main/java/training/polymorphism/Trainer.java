package training.polymorphism;

import java.util.Arrays;
import java.util.List;

public class Trainer extends Human{

    private List<Course> courses;

    public Trainer(String name, List<Course> courses) {
        super(name);
        this.courses = courses;
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course")));
        System.out.println(trainer instanceof HasName);
    }
}
