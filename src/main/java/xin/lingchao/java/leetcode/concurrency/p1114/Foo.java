package xin.lingchao.java.leetcode.concurrency.p1114;

import java.util.concurrent.CountDownLatch;

class Foo {

    private CountDownLatch c2;
    private CountDownLatch c3;

    public Foo() {
        c2 = new CountDownLatch(1);
        c3 = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        c2.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        c2.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        c3.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        c3.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
