public class Transactions {
    /*
    - một transaction chứa các thay đổi, một hoặc nhiều thao tác SQL thực hiện thay đổi dữ liệu.
    -
    - các tính chất của một transaction - ACID
        Atomicity (nguyên tử tính): tất cả các thao tác phải được thực hiện hoàn toàn hoặc khong thao tác nào được thực hiện
        Consistency (nhất quán): transaction phải chuyển từ trạng thái nhất quán này sang trạng thái nhất quán khác
                                - tức là tất cả các ràng buộc (khoá chính khoá ngoại...) phải được giữ nguyên
        Isolation (cô lập): các transaction độc lập với nhau, các thay đổi của transaction này không được thấy bởi transaction khác
                            cho đến khi transaction kia hoàn thành
        Durability (Bền vững): khi một transaction được commit thì tất cả dữ liệu là vĩnh viễn

    - CÁC CÂU LỆNH QUẢN LÍ TRANSACTIONS:
        START/BEGIN TRANSACTION; // bắt đầu một transaction
        COMMIT; // cam kết các thay đổi, làm cho dữ liệu trở lên vĩnh viễn
        ROLLBACK; // huỷ bỏ các thay đổi ban đầu, quay về trạng thái trước khi transaction bắt đầu
        SAVEPOINT; // điểm lưu trữ, có thể quay lại khi cần thiết
        ROLLBACK TO SAVEPOINT; // quay lại một điểm trong transaction mà không huỷ bỏ toàn bộ transaction
    - VÍ DỤ VỀ TRANSACTION

    SÂU HƠN VỀ TRANSACTION
    - transaction là một tập câu lệnh được thực thi tuần tự, nếu có câu lệnh nào bị lỗi thì transaction sẽ dừng lại và ROLLBACK tất cả
        các câu lệnh đã thực thi, về lúc trước khi bắt đầu transaction
    - LOCKING và ROW VERSIONING (đảm bảo tính toàn vẹn của dữ liệu)
        +) LOCKING: mỗi transaction đều yêu cầu một loại khoá khác nhau: row lock, column lock, table lock... tuỳ vào transaction phụ thuộc vào gì
           Khi transaction được thực hiện thì các dữ liệu sẽ được lock làm cho các transaction khác không thể truy cập vào tài nguyên đang được lock,
           khi transaction không còn phụ thuộc vào tài nguyên bị lock nữa thì nó sẽ giải phóng khoá khi đó các transaction khác mới có thể truy cập
        +) ROW VERSIONING: khi tài nguyên này bị lock thì các transaction khác phải đợi cho đến khi transaction kia hoàn thành thì mới có tể truy cập
                            vào tài nguyên đó, phải chờ đợi nhau dẫn đến giảm hiệu năng của hệ thống, ROW VERSIONING sẽ lưu trữ các version của tài nguyên
                            đang bị lock, khi có transaction muốn đọc dữ liệu thì sẽ được trả về version phù hợp mà không cần đợi trả lock
    - CÁC LOẠI LOCK
            +) SHARE LOCK: read-only lock, nhiều transaction có thể đồng thời giữ share lock
            +) EXCLUSIVE LOCK: write lock, có thể đọc và ghi dữ liệu, tại một thời điểm chỉ có 1 transaction được dữ exclusive lock
            +) UPDATE LOCK: khoá dự định ghi, là khoá chung gian giữu share và exclusive lock, khi ghi dữ liệu thì update lock phải tự chuyển sang
                        exclusive lock, tại 1 thời điểm chỉ có 1 transaction được giữ update lock, và cũng có thể thiết lập sharelock trên dữ liệu
                        đang có update lock
    - QUẢN LÍ TRUY CẬP ĐỒNG THỜI
        CÁC TÁC ĐỘNG KHI TRUY CẬP ĐỒNG THỜI
    - ISOLATION LEVEL

     */
}
