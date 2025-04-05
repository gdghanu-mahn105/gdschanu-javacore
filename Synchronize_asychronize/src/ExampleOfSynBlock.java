public class ExampleOfSynBlock {
    // do gọi các phương thức có thể gây ra lỗi interrupted thì mình phải dùng try catch hoặc throws
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("expectedvalue: 20000");
        System.out.println("kết quả khi không dùng synchronized:" + counter.count);
    }
}

class Counter {
    public int count = 0;

    //    public void increment() {
//        count++;
//    }
    public synchronized void increment() {
        count++;
    }
}