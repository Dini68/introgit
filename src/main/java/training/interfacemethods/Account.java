package training.interfacemethods;

import java.time.LocalDateTime;

public class Account implements Audited, CreatedAtJanuary {

    private  LocalDateTime localDateTime;

    public Account(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean createdAfter(LocalDateTime dateTime) {
        return CreatedAtJanuary.super.createdAfter(dateTime);
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return localDateTime;
    }
}
