package DesignPrinciple;

class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class FixedDepositAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Cannot withdraw from Fixed Deposit");
    }
}

public class BankingSystemViolation {
    public static void main(String[] args) {
        BankAccount account = new FixedDepositAccount();
        account.withdraw(1000); // Runtime error
    }
}

