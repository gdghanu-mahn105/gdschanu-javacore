public class main {
    public static void main(String[] args) {
        Doing<Teacher, String> Do = new Doing<>(new Teacher(), "teaching");
        Doing<Doctor, String> Do1 = new Doing<>(new Doctor(), "Examination");

        System.out.println("Teacher's work: " + Do.getWork());
        System.out.println("Doctor's work: " + Do1.getWork());

//        Doing <Dog,  String> dogDo= new<> (new Dog, "eating");


    }
}
