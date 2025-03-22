import java.util.Scanner;

public class TryCatchrun {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("phép chia cho 0");
        }

        try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        }
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("mời thượng đế nhập số: ");
            int i = sc.nextInt();
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("nhập sai kiểu ròi");
        }


        try {
            int[] arr = null;
            System.out.println(arr[5]);
        } catch (NullPointerException e) {
            System.out.println("your array is null");
        }
    }
}
