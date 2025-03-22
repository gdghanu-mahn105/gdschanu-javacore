public class Final {
    // final là không thể thay đổi được bất kì thứ gì
    // final class variable method
    final int MAX = 5;

    final public void hello() {
        System.out.println("hello");
    } // method này khong thể override bởi subclass
    // final class khong thể được kế thừa bởi class khác

    static final int n;

    static {
        n = 200;
    }

    public static void main(String[] args) {
        System.out.println(n);
    }
}

