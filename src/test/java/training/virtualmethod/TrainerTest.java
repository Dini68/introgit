package training.virtualmethod;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testFreeTimeByHuman() {
        Human human = new Human("John Doe");
        assertEquals(4,human.getFreeTime());
    }

    @Test
    public void testFreeTimeByTrainer() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertEquals(3,trainer.getFreeTime());

        Human human = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        assertEquals(3,trainer.getFreeTime());
    }

    @Test
    public void testFreeTimeLimit() {
        Trainer trainer = new Trainer("John Doe",
                Arrays.asList(new Course("Course1"), new Course("Course2")));
        assertEquals(2,trainer.getFreeTime());

        Human human = new Trainer("John Doe",
                Arrays.asList(new Course("Course1"), new Course("Course2")));
        assertEquals(2,trainer.getFreeTime());
    }

}
