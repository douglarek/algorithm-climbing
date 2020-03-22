package xin.lingchao.java.jvm;

import java.util.ArrayList;
import java.util.List;

// Java 堆内存溢出异常测试
//
// <深入理解 JVM 虚拟机第 3 版> 代码清单 2-3
//
// $ java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -cp target/climbing-1.0-SNAPSHOT.jar
// xin.lingchao.java.jvm.HeapOOM
//
// java.lang.OutOfMemoryError: Java heap space
// Dumping heap to java_pid44039.hprof ...
// Heap dump file created [27624785 bytes in 0.108 secs]
// Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
// at java.util.Arrays.copyOf(Arrays.java:3210)
// at java.util.Arrays.copyOf(Arrays.java:3181)
// at java.util.ArrayList.grow(ArrayList.java:265)
// at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
// at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
// at java.util.ArrayList.add(ArrayList.java:462)
// at xin.lingchao.java.jvm.HeapOOM.main(HeapOOM.java:19)
//
// 使用 visualvm 打开 java_pid44039.hprof 文件分析即可
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
