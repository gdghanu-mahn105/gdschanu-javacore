// encapsulation: để che giấu dữ liệu, tạo lớp readonly and writeonly bằng cách viết setter và getter
// tăng tính kiểm soát dữ liệu, đặt điều kiện logic bên trong setter.


public class Encap {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;

    }

    public void setB(int b) {
        this.b = b;
    }

    public int SumOf2(int a, int b) {
        return a + b;
    }

}


