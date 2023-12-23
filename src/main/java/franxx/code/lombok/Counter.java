package franxx.code.lombok;

import lombok.Getter;
import lombok.Synchronized;

public class Counter {

    private final Object counterLock = new Object();

    private Long counter = 0L;

    @Synchronized(value = "counterLock")
    public void increment(){
        this.counter += 1;
    }

    @Synchronized(value = "counterLock")
    public Long getCounter() {
        return counter;
    }
}
