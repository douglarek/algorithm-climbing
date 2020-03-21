package xin.lingchao.java.leetcode.concurrency.p1117;

import java.util.concurrent.CountDownLatch;
import org.junit.jupiter.api.Test;

public class H2OTest {
    @Test
    public void testH2O() throws InterruptedException {
        H2O h2o = new H2O();
        CountDownLatch c = new CountDownLatch(6);

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    h2o.oxygen(() -> {
                        System.out.print("O");
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c.countDown();
            }).start();
        }

        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                try {
                    h2o.hydrogen(() -> {
                        System.out.print("H");
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c.countDown();
            }).start();
        }

        c.await();
        System.out.println();
    }
}
