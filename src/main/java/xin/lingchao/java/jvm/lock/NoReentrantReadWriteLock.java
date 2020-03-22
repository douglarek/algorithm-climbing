package xin.lingchao.java.jvm.lock;

// 不可重入读写锁的简单实现
//
// http://tutorials.jenkov.com/java-concurrency/read-write-locks.html#simple
public class NoReentrantReadWriteLock {
    private int readers = 0;
    private int writers = 0;
    private int writeRequests = 0;

    public synchronized void lockRead() throws InterruptedException {
        // 只要没有线程拥有写锁(writers == 0),
        // 且没有线程在请求写锁(writeRequests == 0),
        // 所有想获得读锁的线程都能成功获取.
        while (writers > 0 || writeRequests > 0) {
            wait();
        }

        readers++;

    }

    public synchronized void unlockRead() {
        readers--;
        // 此处以及下面 unlockWrite 为什么用 notifyAll ?
        //
        // 如果有线程在等待获取读锁, 同时又有线程在等待获取写锁
        // 如果这时其中一个等待读锁的线程被 notify 方法唤醒, 但因为此时仍有请求写锁的线程存在（writeRequests > 0）
        // 所以被唤醒的线程会再次进入阻塞状态
        // 然而可能等待写锁的线程一个也没被唤醒, 就像什么也没发生过一样
        // 如果用的是 notifyAll 方法, 所有的线程都会被唤醒, 然后判断能否获得其请求的锁
        //
        // 用notifyAll 还有一个好处,
        // 如果有多个读线程在等待读锁且没有线程在等待写锁时,
        // 调用 unlockWrite 后, 所有等待读锁的线程都能立马成功获取读锁, 而不是一次只允许一个
        notifyAll();
    }

    // 当一个线程想获得写锁的时候
    // 首先会把写锁请求数加 1 (writeRequests ++)
    // 然后再去判断是否能够真能获得写锁
    // 当没有线程持有读锁 (readers == 0 ), 且没有线程持有写锁 (writers == 0 )时就能获得写锁
    // 有多少线程在请求写锁并无关系
    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;

        while (readers > 0 || writers > 0) {
            wait();
        }

        writeRequests--;
        writers++;
    }

    public synchronized void unlockWrite() {
        writers--;
        notifyAll();
    }

}
