public class Architecture {
/*
MySQL Architecture
Gồm 3 layer
UTILITY Layer
- Là nơi xử lý những phầm mềm liên quan đến việc tạo kết nối giữa client với mysql server.
- Connection pool: cung cấp những dịch vụ về xác thực tài khoản, bảo mật, xử lý kết nối.
  max-connection: ví dụ cho max là 100, với connection pool thì sẽ chờ xem connection nào xong thì cho những cái ngoài 100 chạy
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

- các bước thực hiện câu lệnh
- cache: tối ưu hơn, vì dữ liệu nếu lấy thẳng từ disk thì sẽ lâu hơn, nên khi data được chạy vào cache, khi muốn dùng lại thì không cần kéo từ disk lên nữa,
    tương tự như vậy với chiến lược thực thi (query plan)

  cách 1 câu sql được thực thi
  B1: kiểm tra cú pháp
  B2: xác thực dữ liệu có tồn tại hay không, quyền truy cập
  B3: kiểm tra câu lệnh trong shared pool: xem câu lệnh đã tồn tại hay chưa
  B4: tối ưu hoá, các phương án khác nhau => tối ưu nhất
  B5: đưa ra kế hoạch thực thi

  kiến thúc bộ nhớ: 2 phần
  1: chứa dữ liệu (buffer pool, puffer cache) => khong cần phải đi xuống disk
  2: chứa các câu DML (redo log)

  dữ liệu được lấy từ ổ cứng (disk):
  lưu bằng tablespace (tổ hợp các file cùng tính chất)
  có tablespace của systems
  undo tablespace (rollback)
  temp tablespace (bảng tạm thời)- mỗi lần hoạt động xong nó giải phóng
  có các tablespace custom theo nhu cầu người dùng
  redo log File
 */
}