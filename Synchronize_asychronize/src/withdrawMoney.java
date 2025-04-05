public class withdrawMoney implements Runnable {
    myAccount Acc;

    public withdrawMoney(myAccount Acc) {
        this.Acc = Acc;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            this.Acc.withdraw(10);
        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
