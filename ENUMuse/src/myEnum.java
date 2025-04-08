// an enum like a class, have attributes and methods. the difference is that
// enum constants are public, static and final (immutable, can not override)
// enum can be used to create object but can not extend other class,,
// but can implement other interface
// USE: when values are known, things can not be changed like months, days, colors etc

public class myEnum {
    enum level {
        LOW,
        MEDIUM,
        HIGH,
        ;

        public void getEnum() {
            System.out.println("this is my enum");
        }

    }

    public static void main(String[] args) {
        level myLevel = level.MEDIUM;
        myLevel.getEnum();

        //often use in switch
        switch (myLevel) {
            case LOW -> System.out.println("low level");
            case MEDIUM -> System.out.println("medium level");
            case HIGH -> System.out.println("high level");
        }

        for (level capDo : level.values()) {
            System.out.println(capDo);
        }
    }
}
