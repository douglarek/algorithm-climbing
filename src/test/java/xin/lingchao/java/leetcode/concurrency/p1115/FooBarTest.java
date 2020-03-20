package xin.lingchao.java.leetcode.concurrency.p1115;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

public class FooBarTest {
    @Test
    public void testFooBar() throws InterruptedException {

        FooBar fb = new FooBar(5);

        CountDownLatch c = new CountDownLatch(2); // 作用是等 foobar 打印完毕后断行

        new Thread(() -> {
            try {
                fb.foo(() -> System.out.print("foo"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();
        new Thread(() -> {
            try {
                fb.bar(() -> System.out.print("bar"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.countDown();
        }).start();

        c.await();
        System.out.println();
    }
}
