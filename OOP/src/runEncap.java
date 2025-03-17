public class runEncap {
    public static void main(String[] args) {
        Encap test = new Encap();
        test.setA(23);
        test.setB(300);
        System.out.println(test.getA() + "+" + test.getB());
        int i = test.SumOf2(test.getA(), test.getB());
        System.out.println(i);
    }
}

