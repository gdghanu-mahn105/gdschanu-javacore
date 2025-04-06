@FunctionalInterface
interface MyFunctionalInterface {

    //A method with no parameter
    public String sayHello();
}

public class lambdaExpression {

    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}
//interface StringConcat {
//
//    public String sconcat(String a, String b);
//}
//public class Example {
//
//    public static void main(String args[]) {
//        // lambda expression with multiple arguments
//        StringConcat s = (str1, str2) -> str1 + str2;
//        System.out.println("Result: "+s.sconcat("Hello ", "World"));
//    }
//}