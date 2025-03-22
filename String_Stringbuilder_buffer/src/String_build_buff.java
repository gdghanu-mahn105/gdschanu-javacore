// String pool: là bộ nhớ đặc biệt nằm trong bộ nhớ heap(heap memory) để lưu trữ các biến String
//giúp tối ưu hoá lưu trữ và sử dụng vùng nhớ khi khai báo , hạn chế tràn bộ nhớ nhớ nhớ nhớ Java heap space
// StringBuilder và StringBuffer để tạo chuỗi  có thể thay đổi => tiết kiệm bộ nhớ hơn string
// có các method mà string không có: insert(), delete(), reverse()
public class String_build_buff {
    public static void main(String[] args) {
        String s = "meomeo"; // S1 và S2 sẽ lưu cùng 1 vị trí trong stringpool
        String s1 = "meomeo"; // literal string- gán
        s = s + "gaugau";
        System.out.println(s1);

        StringBuilder Stringbuilder = new StringBuilder(); // keyword new => tạo ra 1 ô nhớ riêng ở heap, không phải trong stringpool
        Stringbuilder.append("meomeo");
        Stringbuilder.append(" builder");
        System.out.println(Stringbuilder.toString());

        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("gaugau");
        stringbuffer.append("buffer");
        System.out.println(stringbuffer.toString());

    }
}

