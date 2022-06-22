package exception02;

public class Account {
    private int balance;    // 잔고
    public Account() {}

    public int getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws BalanceInsufficientException {
        if(balance < money) {
            throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
