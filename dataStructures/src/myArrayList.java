import java.util.ArrayList;

// ArrayList class is a resizable array
// the elements in ArrayList are actually objects => primitive types must be wrapper to objects (by wrapper class: the way to
// use primitive data type as an object, just uppercase the first letter)
public class myArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("holle");
        arr.add("xin chào");
        arr.add("ni hảo");
        arr.add(1, "hi");
        arr.remove(2);
        arr.get(3);
        arr.set(0, "chao xìn");
//        arr.clear();
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

// ArrayList VS LinkedList
/*
LinkedList class is a collection which contain many objects of the same type, like the ArrayList
same method
use the same way but they are built very differently

ArrayList class has a regular array inside it. when an elements is added, it is placed into the array. if the array
is not big enough, a new larger array is created to replace and remove the old one.
memory: hạn chế là mỗi khi nó vượt ra ngoài array có sẵn nó sẽ phải tìm một cái array mới dài hơn gấp mấy lần để sao chép và gán giá trị sang array mới
chẳng hạn nếu mà array là 1 triệu ô nhớc cạnh nhau, bây giờ muốn thêm 1 phần tử mới vào cạnh một triệu phần tử thì array mới sẽ có thể phải là 2 triệu => tốn bộ nhớ...

còn Linkedlist do cơ chế móc nối, nên nếu muốn thêm 1 phần tử vào 1 triệu thì nó sẽ cấp phát bộ nhớ random cho phần tử lẻ đó và nối với phần tử cuối cùng của list

LinkedList stores its items in "containers". the list has a link to the first container and each container has a
link to the next container in the list. to add an element to the list, the element is placed into a new container
and that container is linked to one of the other containers in the list
LinkedList provide several methods: addFirst(),addLast, removeFirst/Last(), getFirst(),GetLast()

WHEN TO USE: ARRAYLIST -> STORE AND ACCESS DATA
            LINKEDLIST -> MANIPULATE DATA

 */
