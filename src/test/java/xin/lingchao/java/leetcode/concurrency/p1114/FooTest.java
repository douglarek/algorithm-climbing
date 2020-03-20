package xin.lingchao.java.leetcode.concurrency.p1114;

import org.junit.jupiter.api.Test;

public class FooTest {
    @Test
    public void testFoo() {

        Foo foo = new Foo();

        Thread t1 = new Thread(() -> {
            try {
                foo.first(() -> System.out.println("first"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                foo.second(() -> System.out.println("second"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                foo.third(() -> System.out.println("third"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t3.start();
        t2.start();
        t1.start();
    }
}
