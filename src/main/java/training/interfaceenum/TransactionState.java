package training.interfaceenum;

public enum TransactionState implements HasTransactionState{

    PENDING {
        @Override
        public boolean isCompleted() {
            return false;
        }
    }, SUCCES {
        @Override
        public boolean isCompleted() {
            return true;
        }
    }, REJECTED {
        @Override
        public boolean isCompleted() {
            return true;
        }
    };
}
