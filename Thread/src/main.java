import java.util.Scanner;

// threading allow a program to run multiple tasks simultaneously, help improve the performance with time-consuming operations
// create a thread by : extend the thread class, impliment the runnable interface
// with extend thread class, it is single inherited, so it can't extend more,
// with implement thread interface, you can implement more, and extend another class

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("you have 5 seconds to enter the password!!");

        MyRunnable myRunable = new MyRunnable();
        Thread thread = new Thread(myRunable);
        thread.setDaemon(true);// when the main thread finished, the thread in background will stop
        thread.start();

        System.out.println("enter your password: ");
        int passW = sc.nextInt();
        System.out.println("your password is " + passW);
        sc.close();
    }
}
