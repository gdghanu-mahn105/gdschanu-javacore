public class myAccount {
    private double money;
    private String name;

    public myAccount(double money, String name) {
        this.money = money;
        this.name = name;
    }

    // nếu như không thêm synchronized vào method thì 2 thread sẽ chạy cùng vào cái method này nên xảy ra lỗi,
    // thêm vào thì trong 1 thời điểm chỉ cho phép 1 thread chạy vào thôi
    public void withdraw(double i) {
        if (getMoney() >= i) {
            try {
                Thread.sleep(1000);
                this.setMoney(this.getMoney() - i);
                System.out.println(this.money);
            } catch (InterruptedException e) {
                System.out.println("lỗi rồi");
            }
        } else {
            System.out.println("your account is not enough money");
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
