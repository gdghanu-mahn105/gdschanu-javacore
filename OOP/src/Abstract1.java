// abstract class là một lớp trừu tượng, không thể tạo ra các đối ,dùng để định nghĩa các phương thức chung cho các lớp con kế thừa nó
// abstract class có thể có thuộc tính abstract và non-abstract
//Một lớp con kế thừa từ abstract class phải triển khai tất cả các phương thức abstract của nó hoặc nó cũng phải được khai báo là một abstract class.

public abstract class Abstract1 {
    public int tuoi;
    public String tengoi;

    public abstract void tiengKeu();

    public void keumacdinh() {
        System.out.println("mèo méo meo mèo meo, con mèo ngu ngốc đáng yêuu balbla");
    }
}
