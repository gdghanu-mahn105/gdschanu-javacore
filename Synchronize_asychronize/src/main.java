public class main {
    // lí thuyết synchronize
    /*
     * từ khoá synchronize được dùng để đồng bộ khoá các phương thức hoặc khối lệnh trong môi trường đa luồng
     * khi một phương thức hoặc khối lệnh được khai báo là synchronized, nó chỉ có thể được thực thi bởi một thread vào cùng một thời điểm
     * đặc điểm nổi bật: đảm bảo tính đúng đắn của dữ liệu, an toàn của dữ liệu, tăng hiệu suất
     * giảm thiểu xung hột, tăng tính ổn định
     * Cách hoạt động: khi 1 luồng truy cập vào phương thức hoặc kối mã được synchronized, nó sẽ lấy khoá (lock), sau khi hoàn thành công việc
     * nó sẽ giải phóng khoá và cho phép luồng khác tiếp tục truy cập
     *
     * không chỉ có thread synchronization còn có process synchronization
     * Thread synchro có 3 loại chính là string synch (không khuyến khích, sử dụng chuỗi làm khoá trong block hoặc methods)
     *   loại thứ 2 là mutual exclusion : chỉ một luồng được truy cập trong 1 thời điểm
     *   inter-Thread Communication: giao tiếp giữa các thread: wait(), notify(), notifyAll()
     * có synchronized method và synchronized block
     * synchronized block
     *
     *hạn chế của sychronized: có thể giảm hiệu suất nếu dùng sai, khi dồng bộ chỉ nên đồng bộ một phần, đồng bộ toàn bộ co thể gây cản trở
     *  lỗi deadlock: xảy ra khi 2 hoặc nhiều luồng đợi nhạu để giải phóng khoá mà chúng đang nắm giữ, treo vô thời hạn
     * lỗi starvation: 1 luồng không thể tiếp tục hoặc thực hiện nhiệm vụ vì tài nguyên đang bị luồng khác chiếm giữ
     *
     *
     *
     * */
    public static void main(String[] args) {
        myAccount a = new myAccount(15, "manh");
        Runnable rutTien = new withdrawMoney(a);
        Thread thread1 = new Thread(rutTien);
        thread1.start();
        Runnable rutTien1 = new withdrawMoney(a);
        Thread thread2 = new Thread(rutTien1);
        thread2.start();


    }
}
