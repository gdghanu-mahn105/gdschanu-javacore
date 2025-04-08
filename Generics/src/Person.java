public interface Person {
    public void work();
}

class Teacher implements Person {
    @Override
    public void work() {
        System.out.println("teaching");
    }
}

class Doctor implements Person {
    @Override
    public void work() {
        System.out.println("examinating");
    }
}
