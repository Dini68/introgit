package training.interfaceenum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionStateTest {

    @Test
    public void testIsCompleted() {
        HasTransactionState hasTransactionState = TransactionState.PENDING;
        assertEquals(false,hasTransactionState.isCompleted());
    }
}
