import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPI {
    // stream API giúp xử lí tập hợp dữ liệu (list, array...) một cách dễ dàng và hiệu quả
// stream là một chuỗi các phần tử có thể được xử lí tuần tự hoặc song song
    // không lưu dữ liệu, chỉ là một cách để thao tác với các dữ liệu (immutable)
    // các phép toán :
    /*
     * Phép toán trung gian (intermediate operations): trả về một stream mới và không thực hiện
     * bất kì phép toán nào cho đến khi phép toán cuối cùng được gọi vd: filter(), map(), sorted(),...
     * Phép toán cuối cùng (Terminal operations): xử lí dữ liệu và trả về một kết quả vd: forEach(), collect(), count()*/
    // Function: Nhận một đối tượng và trả về một đối tượng khác.
    //Predicate: Nhận một đối tượng và trả về giá trị boolean.
    //Consumer: Nhận một đối tượng và không trả về giá trị.
    //Supplier: Không nhận tham số và trả về một đối tượng.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("manh", "do", "duy");
        // tạo Stream từ danh sách
        names.stream().forEach(name -> System.out.println(name));
        List<String> list = Arrays.asList("aaaa", "bbb", "cc", "dd");
        // lọc và ánh xạ
        List<String> chuCais = list.stream()
                .filter(chuCai -> chuCai.length() >= 3)
                .map(chuHon3 -> chuHon3.toUpperCase())
                .collect(Collectors.toList());
        // collector là một interface được dùng để thu thập các phần tử trong stream và biến thành dạng khác
        System.out.println(chuCais);
        long cacChuCai = list.stream().sorted().count();
        System.out.println(cacChuCai);
        // reduce cho phép kết hợp các phần tử trong stream thành 1 giá trị duy nhất
        List<Integer> daySo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = daySo.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
