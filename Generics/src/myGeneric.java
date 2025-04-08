import java.util.ArrayList;
import java.util.Dictionary;

public class myGeneric {
    //generic được hiểu là tham số hoas kiểu dữ liệu. việc tham số hoá kiểu dữ liệu =>
    // dễ bắt lỗi các kiểu dữ liệu không hợp lệ, dễ dàng hơn cho việc tạo và sử dụng các class, interface,
    // method, với nhiều kiểu gữ liệu khác nhau
    public static void main(String[] args) {
        // thay vì phải tạo nhiều class để xử lí nhiều dữ liệu
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
//        list.add(12); không hợp lệ
        System.out.println();
    }
}

// một số quy ước
    /*
    T-type(kiểu dữ liệu thuộc wrapper class)
    E-element (phần tử-dùng trong Collection framework)
    K-key(khoá)
    V-value(giá trị)
    N-number (kiểu số)
    ....
     */
