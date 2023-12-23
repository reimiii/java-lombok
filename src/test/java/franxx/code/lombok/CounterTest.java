package franxx.code.lombok;

import org.junit.jupiter.api.Test;

public class CounterTest {

    private Counter counter = new Counter();

    @Test
    void synchronizer() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {

                for (int j = 0; j < 100; j++) {
                    counter.increment();
                }

            }).start();
        }

        Thread.sleep(5000L);
        System.out.println(counter.getCounter());
    }
}
