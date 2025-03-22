public class PassByValue {

    // pass by value là sao chép giá trị của biến x và y rồi truyền vào trong hàm, sau khi hàm thực , cũng sẽ không làm thay đổi biến ngoài hàm
    public static void modify(int x, int y) {
        x = 100;
        y = 200;
        System.out.println("X - Y from modidy: " + x + " - " + y);

    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("X - Y before modidy: " + x + " - " + y);

        modify(x, y);

        System.out.println("X - Y after modidy: " + x + " - " + y);
    }

}

