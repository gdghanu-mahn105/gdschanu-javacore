/*
Database: cơ sở dữ liệu- tập hợp dữ liệu có cấu trúc, tổ chức
Đề cập đến một phần mềm được dùng để lưu trữ và tổ chức dữ liệu

Database thường được kiểm soát bởi một hệ quản trị cơ sở dữ liệu Database Management System-DBMS: một gói phần mềm với các tiện ích được thiết kế để xác định, thao tác, truy suất và quản lí dữ liệu trong database

Phân loại Database
Database quan hệ(RDBMS):
        lữu dữ liệu theo dạn bảng với các hàng, cột, có ràng buộc khoá chính và khoá ngoại
        Ưu điểm: cấu trúc rõ ràng, truy vấn SQL mạnh mẽ, đảm bảo tính toàn vẹn dữ liệu
        MySQL, PostgreSQL, Oracle SQL, Server
        Ứng dụng: hệ thống doanh nghiệp, website thương mại, quản lí tài chính….
Database phi quan hệ (NoSQL):
        Lưu trữ dữ liệu linh hoạt, không cần cấu trúc bảng cố định, áp dụng nhiều mô hình như document, ket-value, graph, column
        Linh hoạt, mở rộng rễ dàng, hiệu năng cao với dữ liệu phi cấu trúc
        MongoDB, Cassandra, Redis, Firebase
        Ứng dụng web, mobile, Big Data, IoT, mạng xã hội, ứng dụng thời gian thực
Database phân tán (Distributed DB):
        Dữ liệu được phân chia và lưu trữ trên nhiều máy chủ, giúp tăng khả năng chịu lỗi và khả năng mở rộng
        Chia sẻ tải, tối ưu cho các hệ thống quy mô lớn
        Google Bigtable, Âpche Cassandra
        Hệ thống cần hiệu suất cao, dịch vụ trực tuyến, mạng xã hội, ứng dụng xử lí khối lượng lớn dữ liệu.
Database đám mây (Cloud DB):
        lưu trữ và quản lí dữ liệu trên đám mây, cho phép truy cập từ xa và tích hợp dễ dàng với các dịch vụ khác.
        Chi phí hợp lí, không cần đầu tư hạ tầng, dễ dàng mở rộng linh hoạt,
        Amazong RDS, Google Cloud SQL..
        Ứng dụng di động, web apps, startups, dịch vụ trực tuyến


Các thành phần chính của Database:
- Dữ liệu: thông tin được lưu trữ, có nhiều dạng khác nhau
- Cơ sở dữ liệu: tập hợp các dữ liệu được tổ chức theo một cấu trúc cụ thể, một số cấu trúc phổ biến của cơ sở dữ liệu bao gồm bảng, đồ thị, cây…. Giúp người dùng xác định và thể hiện mối quan hệ giữa các dữ liệu trọng hệ thống, lưu trữ và quản lí dữ liệu một cách hiệu quả và có tổ chức
- Ngôn ngữ truy vấn cơ sở dữ liệu (Database query language) là thành phần giao tiếp của database, là ngôn ngữ giao tiếp sử dụng để thao tác với dữ liệu
- Người dùng

Vai trò:
- Đảm bảo khả năng truy suất dữ liệu
- Lưu trữ lượng lớn thông tin theo hệ thống
- Dễ dàng trong công tác quản lí
- Đảm bảo an toàn dữ liệu
- Hạn chế trùng lặp dữ liệu
- Thay đổi theo như cầu một cách linh hoạt, mở rộng

 */
public class database {
    public static void main(String[] args) {

    }
}