public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // the code that you want to run in background in a seperate thread
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interupted");
            }
            if (i == 5) {
                System.out.println("you are out of time!!");
                System.exit(0);
            }
        }
    }
}
