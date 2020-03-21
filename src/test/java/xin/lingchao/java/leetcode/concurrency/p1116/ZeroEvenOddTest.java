package xin.lingchao.java.leetcode.concurrency.p1116;

import java.util.concurrent.CountDownLatch;
import org.junit.jupiter.api.Test;

public class ZeroEvenOddTest {
    @Test
    public void testZeroEvenOdd() throws InterruptedException {
        ZeroEvenOdd zeo = new ZeroEvenOdd(5);
        CountDownLatch c = new CountDownLatch(3);

        new Thread(() -> {
            try {
                zeo.zero(x -> System.out.print(x));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();
        new Thread(() -> {
            try {
                zeo.even(x -> System.out.print(x));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();
        new Thread(() -> {
            try {
                zeo.odd(x -> System.out.print(x));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();

        c.await();
        System.out.println();
    }
}
