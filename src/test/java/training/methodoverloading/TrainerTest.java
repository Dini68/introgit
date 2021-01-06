package training.methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void addCourseTest() {
        Trainer trainer = new Trainer();
        trainer.addCourse("Course1");
        trainer.addCourse("Course2",0);
        trainer.addCourse(new Course("Course3"));

        assertEquals("Course2", trainer.getCourses().get(0).getName());
        assertEquals("Course3", trainer.getCourses().get(2).getName());
    }
}
