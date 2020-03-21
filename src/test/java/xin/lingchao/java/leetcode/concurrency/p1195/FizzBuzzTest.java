package xin.lingchao.java.leetcode.concurrency.p1195;

import java.util.concurrent.CountDownLatch;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() throws InterruptedException {

        FizzBuzz fb = new FizzBuzz(15);

        CountDownLatch c = new CountDownLatch(4);

        new Thread(() -> {
            try {
                fb.number(a -> System.out.print(a));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();

        new Thread(() -> {
            try {
                fb.fizz(() -> System.out.print("fizz"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();

        new Thread(() -> {
            try {
                fb.buzz(() -> System.out.print("buzz"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();

        new Thread(() -> {
            try {
                fb.fizzbuzz(() -> System.out.print("fizzbuzz"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();

        c.await();
        System.out.println();
    }
}
