public class MyIndex {
    /*
    index là một cấu trúc dữ liệu được sử dụng để truy vấn dữ liệu nhanh hơn mà không cần quest toàn bộ bảng
    index là một cách tối ưu hệu suất truy vấn database bằng việc giảm lượng truy cập vào b nhớ khi thực hiện truy vấn
    - trỏ tới địa chỉ dữ liệu trong một bảng ~ mục lục của cuốn sách

    - khi không có index, câu query sẽ thực hiện chạy qua tất cả các row của bảng để so sánh và tra kết quả

    - Hash index -hàm băm- dạng key value, khi đưa một chuõi hàm băm sẽ băm thành cacs số
        mạnh mẽ với truy vấn toán tử = hay <> (IN, NOT IN)
        nhưng lại khong hữu ích khi truy vấn với >,<, like vì index này không có thứ tự
        không thể tối ưu hoá ORDER BY bằng việc sử dụng hash index vì nó khôgn tìm kiếm được phần tử tiếp theo trong index
    - B-Tree: (MySQL)
           - lưu trữ theo dạng cây
           - có thể dùng các biểu thức so sánh dạng = , >, >=,<,<= between và like
           - được sử dụng cho những column trong bảng khi muốn tìm kiếm một giá trị nằm trong khoảng nào đó
           - cơ chế đánh index cho 1 trường: +) tìm vị trí thích hợp để chèn dữ liệu mới
                                             +) chèn dữ liệu vào leaf phù hợp
                                             +) phân chia node leaf tràn (nếu cần)
                                             +) lặp lại quá trình nếu cần thiết
    - SYNTAX:
        CREATE INDEX index_name
        ON table_name(column1, column2,...);

        CREATE UNIQUE INDEX index_name
        ON table_name(col1, col2....); // giá trị trong cột sẽ không trùng lặp

        DROP INDEX index_name

        VD: CREATE INDEX idx_CustomerName ON Customers(CustomerName);
        CREATE INDEX index_CusID_OrDate ON Orders(CustomerID, OrderDate);
        tạo ra index của 2 column, thứ tự, đánh index của customerID trươớc sau đó là OrderDate
     - CÁC LOẠI INDEX
        +) clustered Index: Sắp xếp và lưu trữ dữ liệu bảng theo thứ tự của chỉ mục. Mỗi bảng chỉ có thể có một Clustered Index.
        +) Non-clustered Index: Lưu trữ các con trỏ đến các vị trí của bản ghi dữ liệu trong bảng, không ảnh hưởng đến
        thứ tự lưu trữ của bảng. Một bảng có thể có nhiều Non-clustered Index.
        +) Full-text Index: Dùng cho các tìm kiếm văn bản phức tạp, hỗ trợ tìm kiếm toàn văn.
        +) Hash Index: Sử dụng hàm băm để tạo chỉ mục, thường dùng trong các hệ thống NoSQL.

     - LƯU Ý: index
            +) index sẽ là tốn thêm bộ nhớ để lưu trữ
            +) làm chậm hoạt động insert hay update column sử dụng index, index cần được điều chỉnh
                (reindex) sẽ tiêu tốn một khoảng thời gian
            +) đánh index bừa bãi sẽ làm giảm hiệu năng hoạt động

      ===== Khi nào NÊN dùng INDEX====
      - bảng có dữ liệu vừa và lớn(>100.000 dòng)
      - các column thường xuyên sử dụng trong mệnh đề WHERE, JOIN và ORDER BY

      ===== KHÔNG NÊN dùng INDEX=====
      - cơ sở dữ liệu nhỏ hoặc cần dùng tài nguyên ít
      - dữ liệu thay đổi trường xuyên
      - cột chứa dữ liệu không đa dạng (nam/nữ)
      - cột chứa dữ liệu text quá dài

      => cần phải lưu ý về thứ tự columns trong một index nhiều trường

      === index được tạo tự động====
      - các khoá chính
      - khoá ngoại
      - cột UNIQUEE
     */


}
