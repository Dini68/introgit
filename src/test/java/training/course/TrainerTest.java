package training.course;

import org.junit.jupiter.api.Test;

public class TrainerTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("John Doe");
        trainer.getName();
    }

    @Test
    public void testAdd() {
        Trainer trainer = new Trainer("John Doe");
        trainer.addCourse("Course1");
    }
    @Test
    public void testFindB() {
        Trainer trainer = new Trainer("John Doe");
        trainer.findCoursesBetween('a', 'z');
    }
    @Test
    public void testFindN() {
        Trainer trainer = new Trainer("John Doe");
        trainer.addCourse("Course1");
        trainer.findCourseByName("Course1");
    }



}
