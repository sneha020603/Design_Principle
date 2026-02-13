package DesignPrinciple;

interface Account{
    void deposite(double amount);
    double getBalance();
}

interface Withdrawble{
    void withdraw(double amount);
}

class SavingAccount implements Account,Withdrawble
{
     private double balance;

     public void deposite(double amount){
        balance += amount;
     }

     public void withdraw(double amount){
        balance -= amount;
     }

     public double getBalance(){
        return balance;
     }
}

class CurrentAccount implements Account,Withdrawble
{
     private double balance;

     public void deposite(double amount){
        balance += amount;
     }

     public void withdraw(double amount){
        balance -= amount;
     }

     public double getBalance(){
        return balance;
     }
}

class FDAccount implements Account
{
     private double balance;

     public void deposite(double amount){
        balance += amount;
     }

     public double getBalance(){
        return balance;
     }
}


public class BankingSystemCorrected {
    
    public static void main(String[] args) {
        SavingAccount a1 = new SavingAccount();
        a1.deposite(5000);
        a1.withdraw(2000);
        System.out.println("Balance: " + a1.getBalance());

        CurrentAccount a2 = new CurrentAccount();
        a2.deposite(5000);
        a2.withdraw(2000);
        System.out.println("Balance: " + a2.getBalance());

        FDAccount a3 = new FDAccount();
        a3.deposite(5000);
        System.out.println("Balance: " + a3.getBalance());
    }
}
