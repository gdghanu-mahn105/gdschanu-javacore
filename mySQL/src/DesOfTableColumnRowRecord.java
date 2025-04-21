public class DesOfTableColumnRowRecord {
    /*
- Bảng - là thành phần quan trọng. Một table bao gồm các hàng và cột, tương ứng với các bản ghi và thuọc tính cảu dữ liệu.
- Mỗi cột (column) đại diện cho một thuộc tính cụ thể.
- Ví dụ trong một table customers, các cột có thể bao gồm name, address, phoneNumber and email. Mỗi hàng trong table chứa các giá trị tương ứng của các thuộc tính đó. Điều này cho phép lưu trữ nhiều bản ghi (records) với các thuộc tính tương ứng.
- Hàng (Row): Mỗi hàng đại diện cho một bản ghi dữ liệu, là một tập hợp các giá trị thuộc về các cột tương ứng.

- Table cũng có các ràng buộc như primary key, foreign key, ràng buộc NOT NULL, UNIQUE, CHECK và DEFAULT để đảm bảo tính nhất quán và đùng đắn của dữ liệu.
Các bảng có thể liên kết với nhau thông qua các quan hệ.

Cách tạo table trong SQL
CREATE TABLE tablename (
Column1 datatype constraint,
Column2 datatype constraint,
….
ColumnN datatype constraint,
);
   Datatype:
- Kiểu số:
    INT: lưu trữ số nguyên có kích thước 4bytes.
    FLOAT: lưu trữ số thực có độ chính xác thấp.
    DOUBLE: lưu trữ số thực có độ chính xác cao.
- Kiểu dữ liệu chuỗi:
    VARCHAR: lưu trữ chuỗi với độ dài thay đổi.
    CHAR: lưu trữ chuỗi ký tự với độ dài cố định.
    TEXT: lưu trữ chuỗi văn bản dài.
- Kiểu dữ liệu ngày và giờ:
    DATE: ngày theo dạng YYYY-MM-DD.
    DATETIME: ngày và giờ theo dạng YYYY-MM-DD HH:MM:SS.
    TIMESTAMP: lưu trữ dấu thời gian theo số giây kể từ 1970.
- Kiểu Boolean: giá trị TRUE / FALSE

Constraint là các ràng buọc áp dụng cho mỗi cột…

Cách thêm cột:
ALTER TABLE tablename ADD columnName datatype constraint;
Cách thêm data:
INSERT INTO tableName (column1, column2,...,columnN)
VALUES (value1, value2,..., valueN);// chèn dữ liệu vào các cột tương ứng

     */
}
