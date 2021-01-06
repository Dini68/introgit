package training.inheritancemethods;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testCreateHuman() {

    }
    @Test
    public void testCreateTrainer() {
        Trainer trainer = new Trainer("KD", 52, Arrays.asList(new Course("Course1")));
        assertEquals(3, trainer.getFreeTime());
    }
}
