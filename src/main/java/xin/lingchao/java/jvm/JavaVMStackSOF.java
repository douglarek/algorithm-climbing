package xin.lingchao.java.jvm;

//
// 虚拟机栈和本地方法栈测试
// 使用 -Xss 参数减少栈内存容量
//
// <深入理解 Java 虚拟机 第 3 版> 代码清单 2-4
//
// 测试程序运行在 openJDK8 下, 要求最小栈大小 160k, 而非书中测试所用 128k
//
// $ java -Xss160k -cp target/climbing-1.0-SNAPSHOT.jar xin.lingchao.java.jvm.JavaVMStackSOF
//
// stack length: 773
// Exception in thread "main" java.lang.StackOverflowError
// at xin.lingchao.java.jvm.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:7)
// at xin.lingchao.java.jvm.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
// at xin.lingchao.java.jvm.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
// at xin.lingchao.java.jvm.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
// at xin.lingchao.java.jvm.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
// at xin.lingchao.java.jvm.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:8)
// ...
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();

        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: " + oom.stackLength);
            throw e;
        }
    }
}
