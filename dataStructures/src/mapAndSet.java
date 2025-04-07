import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class mapAndSet {
    public static void main(String[] args) {
        // HashMap lưu giá trị theo cặp "key-value"=> dộ phức tạp O(1)
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Toán", 8);
        hashMap.put("Văn", 7);
        hashMap.put("Anh", 9);
        hashMap.put("Hoá", 6);
        hashMap.get("Toán");
        boolean exist = hashMap.containsKey("Địa"); // false
        boolean exi = hashMap.containsValue(9);
        System.out.println(hashMap);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("a");// không được chấp nhận vì Set là một tập hợp mà các giá trị phải khác nhau
        System.out.println(hashSet);

    }

}
