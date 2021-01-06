package training.isahasa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testWorkHasCalled() {
        WorkStub workStub = new WorkStub();
        Trainer trainer = new Trainer(workStub);
        trainer.doWork();
        assertEquals(true, workStub.isCalled());

    }

    @Test
    public void testHasNoWork() {
        Trainer trainer = new Trainer(new HasNoWork());
        assertEquals("", trainer.doWork());
    }

    @Test
    public void testCreateMaterials() {
        Trainer trainer = new Trainer(new CreateMaterials());
        assertEquals("Materials", trainer.doWork());
    }

    @Test
    public void testTakeCourse() {
        Trainer trainer = new Trainer(new TakeCourse());
        assertEquals("HappyStudents", trainer.doWork());
    }

    @Test
    public void testComplexWork() {
        Trainer trainer = new Trainer(new ComplexWork(Arrays.asList(new CreateMaterials(), new TakeCourse())));
        assertEquals("Materials, HappyStudents", trainer.doWork());
    }

    @Test
    public void testChangeWork() {
        Trainer trainer = new Trainer(new HasNoWork());
        assertEquals("", trainer.doWork());
        trainer.setWork(new CreateMaterials());
        assertEquals("Materials", trainer.doWork());
    }

}
