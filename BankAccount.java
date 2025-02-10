public class BankAccount {
    int accountNumber;
    float balance;

    public BankAccount(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float isBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
