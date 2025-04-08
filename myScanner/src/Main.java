import java.util.Scanner;

// Scanner is used to get user input
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int tuoi = sc.nextInt();
        String enter = sc.nextLine();
        String lop = sc.nextLine();
        System.out.println("sinh viên tên: " + ten + "tuổi: " + tuoi + " học lớp " + lop);

    }
}