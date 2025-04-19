public class Architecture {
/*
MySQL Architecture
Gồm 3 layer
UTILITY Layer
- Là nơi xử lý những phầm mềm liên quan đến việc tạo kết nối giữa client với mysql server.
- Connection pool: cung cấp những dịch vụ về xác thực tài khoản, bảo mật, xử lý kết nối.
- Khi một câu query được client gửi tới server, utility sẽ tiếp nhận xử lí và tạo kết nối
- Parser: phân tích cú pháp => tạo parser tree
- Check permissions: kiểm tra quyền truy cập
SQL layer:
- Sau khi tiếp nhận parser tree từ Utility layer, có thể được rewrite
- Tiếp theo, optimizer : thực hiện tối ưu hoá, tính toán đưa ra thời gian thực hiện
- Sau khi tính toán tối ưu, mysql đưa ra execution plan và thực hiện bởi executor
Storage Engine Layer
- MySQL lưu trữ dữ liệu trên đĩa cứng
- Có các loại storage engine khác nhau, tuỳ vào đặc điểm dữ liệu sẽ chọn loại phù hợp
- Khi executor thực thi thì query execution engine sẽ tương tác với storage engine qua API, để lấy dữ liệu và trả kết quả cho câu query

 */
}