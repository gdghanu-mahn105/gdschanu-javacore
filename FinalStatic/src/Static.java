// dùng static để tối ưu bộ nhớ, là biến tĩnh
// có thể áp dụng với variable, methods, các lớp trồng nhau (nested class)
// khối static để chứa các dữ liệu
// biến static: là một biến dùng cho mọi đối tượng
// biến static sẽ chỉ lấy 1 vị trí để ghi nhớ
// hạn chế Phương thức static không thể sử dụng biến non-static hoặc gọi trực tiếp phương thức non-static.
//Từ khóa this và super không thể được sử dụng trong ngữ cảnh static.

class theLoai {
    String tenLoai;
    int sotuoi;
    static String loai = "động vật";

    public theLoai(String ten, int tuoi) {
        tenLoai = ten;
        sotuoi = tuoi;
    }

    static public void thayDoi() {
        loai = "không phải động vật, mà là thú cưng";
    }

    public void trieuHoi() {
        System.out.println("đây là con: " + tenLoai + " tuổi là: " + sotuoi + " là " + loai);
    }

    public static void main(String[] args) {
        theLoai.thayDoi();
        theLoai conMeo = new theLoai("Miu", 2);
        theLoai conCho = new theLoai("Mil", 3);
        conMeo.trieuHoi();
        conCho.trieuHoi();

    }
}


public class Static {
    int a = 10;

    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);
    }
}
