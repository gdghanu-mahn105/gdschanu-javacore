public class DifferenceBtwSQLvsNoSQL {
    /*
The difference between SQL and NoSQL

SQL: là một ngôn ngữ truy vấn được thiết kế tương tác ới hệ thống quản lí cơ sở dữ liệu RDBMS, như MySQL,PostgreSQL….
=> hiệu quả trong làm việc với dữ liệu, thêm mới, truy suất, cập nhật hoặc xoá các bản ghi trong cơ sở dữ liệu quan hệ
Dựa trên các bảng có quan hệ với nhau
- Các câu lệnh truy vấn SELECT,UPDATE..để tương tác với dữ liệu
- Khả năng thu nhỏ theo chiều dọc bằng cách tăng lưu lượng phần cứng
- Ứng dụng xử lí giao dịch trực tuyến, ổn định cao
- ACID base- một chuẩn cho RDBMS - tính toàn vẹn và nhất quán của dữ liệu
- Ưu điểm: dữ liêu có quan hệ phức tạp, yêu cầu toàn vẹn dữ liệu (ACID), lược đồ cố định, được định rõ trước.
- Hạn chế: việc mở rộng quy mô lớn và xử lí dữ liệu phi cấu trúc. Việc thay đổi cấu trúc dữ liệu khi ứng dụng phát triển

NoSQL: cơ sở dữ liệu không quan hệ, không yêu cầu một lược đồ cố định, tránh các ghép nối, dễ hàng mở rộng.
      Dùng cho các kho dữ liệu phân tán, lượng lưu trữ khổng lồ.
Có thể bao gồm bigdata và các web application thời gian thực
- Nhiều hướng lưu trữ khác nhau: document-oriented, column-oriented…
- Ngôn ngữ truy vấn đa dạng
- Được tuỳ biến theo chiều ngang bằng cách tăng số lượng máy chủ cơ sở dữ liệu
- Thiết kế cho việc phân tích dữ liệu có cấu trúc chưa hoàn chỉnh
- Ưu điểm: dữ liệu bán cấu trúc và phi cấu trúc, mở rộng nhanh chóng, hiệu suất cao cho đọc và ghi, lược đồ động, linh hoạt và có thể thay đổi.
- BASE - là một mô hình của nhiều hệ thống SQL
- Nhược điểm: không hỗ trợ đầy đủ các tính năng ACID, cú pháp truy vấn và tương tác với dữ liệu phức tạp hơn SQL

KHI NÀO nên dùng SQL
- Khi dữ liệu có ít cấu trúc và ít thay đổi
- Cho phép truy vấn nhanh chóng và thực hiện truy vấn phúc tạp bằng cách sử dụng phép JOIN giữa các bảng
- Có lợi cho việc phân tích

KHI NÀO nên dùng NoSQL
- Xử lí dữ liệu lớn và đa dạng: khi các thành phần khác cảu ứng dụng được thiết kế liền mạch, nhanh chóng, NoSQL ngăn chặn dữ liệu khỏi bottleneck
- Lưu trữ khối lượng lớn dữ liệu phi cấu trúc và bán cấu trúc: không giới hạn các loại dữ liệu khi lưu trữ cùng nhau,
  có thể thêm loại dữ liệu mới khi như cầu thay đổi, thậm chí có thể lưu dữ liệu mà không cần đinh nghĩa loại dữ liệu
- Tận dụng điện toán đám mây và lưu trữ
- Không cần hỗ trợ ACID

     */
}
