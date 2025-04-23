public class RelationshipPrimaryKeyForeignKey {
    /*
Primary Key:  là một cột hoặc các cột trong bảng được sử dụng để xác định duy nhất mỗi hàng trong bảng đó.
Đặc điểm:
    - Đảm bảo tính duy nhất cho mỗi record trong bảng
    - không được phép có giá trị null
    - Không có giá trị trùng lặp
    Ví dụ trong bảng nhân viên có cột id có thể sử dụng để làm primary key
Foreign Key: là một cột hoặc các cột trong bảng mà liên kết đến primary key của bảng khác
Đặc điểm:
    - Tạo mối liên kết giữa các bảng
    - cho phép giá trị NULL
    - Có thể trùng lặp giá trị
    - Duy trì toàn vẹn dữ liệu (data integrity)
Mối quan hệ giữa primary và foreign key:
- Một giá trị trong bảng chính có thể tương ứng với nhiều giá trị trong bảng phụ nhưng trong bảng phụ lại chỉ tham chiếu đến một giá trị duy nhất trong bảng chính
Lợi ích: của 2 key
- Duy trì được toàn vẹn dữ liệu: giúp đảm bảo rằng không có giá trị không hợp lệ nào được phép lưu vào cơ sở dữ liệu
- Tăng cươungf độ chính xác: giúp người dùng dễ dàng tìm kiếm và truy vấn dữ liệu liện quan
- Tạo một mô hình rõ ràng và minh bạch

Relationship:
One-to-One (1:1) => single row in tb1 is linked to a single row in tb2 (a person and their passport)
One-to-Many(1:M) => single row in tb1 can link to multiple rows in tb2 (a customer and their orders)
Many-to-One (M:1) => multiple row tb1 -> 1 row tb2 (many employees working in one department)
Many-to-Many(M:N) => rows tb1-> rows tb2 (students and courses; a student can enroll in many courses, and a course can have many students)

     */
}
