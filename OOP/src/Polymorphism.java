// tinh da hinh duoc hieu la khi duoc goi cung mot phuong thuc nhung moi doi tuong object lai thuc hien mot hanh vi khac nhau
// duoc thuc hien qua overriding va overloading
// overriding la ghi de, lop con thay doi mot phuong thuc da duoc dinh nghia tu lop cha, khi goi den thi no se thuc hien hanh vi cua lop con
// overloading , cac phuong thuc co the cung ten nhung khac nhau ve tham so

public class Polymorphism {
    protected int tuoi;
    protected String doAn;

    public void anHat() {
        System.out.println("dang an hatt");
    }

    public void anHat(String anHat) {
        System.out.println(anHat);
    }
}
