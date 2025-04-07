import java.util.ArrayList;
import java.util.Collection;

public class myCollection {
    /*
    collection là một framework cho phép lưu trữ và xử lí nhóm dữ liệu, tập hợp các phương thức mà các cấu trúc dữ liệu có thể triển khai
    Collection interface: List => ArrayList, Linkedlist
                        Set =>HashSet, LinkedHashSet, TreeSet
                        Queue => thêm xoá các phần tử theo thứ tự: Priority Queue, LinkedList
    Map interface => HashMap, TreeMap, LinkedHashMap
     */
    public static void main(String[] args) {
        Collection<Integer> NhieuDiemSo = new ArrayList<>();
        NhieuDiemSo.add(7);
        NhieuDiemSo.add(9);
        NhieuDiemSo.add(10);
        NhieuDiemSo.add(8);
        for (Integer diemSo : NhieuDiemSo) {
            System.out.println(diemSo);
        }
        System.out.println("số điểm có: " + NhieuDiemSo.size());
        System.out.println("có chứa điểm 9 không " + NhieuDiemSo.contains(9));// true


    }
}
