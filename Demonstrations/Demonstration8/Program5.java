package Demonstrations.Demonstration8;

// 5. A real world example of multithreading : Banking transaction.
// 6. The same with thread synchronization 

// Example: Banking transaction

class Account {
    protected int balance;
    public int accountNo;

    void displayBalance(){
        System.out.println("Account No: " + accountNo + " Balance : " + balance);
    }

    // Method to deposit an amount
     synchronized void deposite(int amount) {
          balance = balance + amount;
          System.out.println(amount + " is deposited ");
          displayBalance();
    }

    // Method to withdraw an amount
     synchronized void withdraw(int amount){
        balance = balance - amount;
        System.out.println(amount + " is withdrawn");
        displayBalance();
    }
}

// To implement a thread for deposit
class TransactionDeposite implements Runnable {
    Account accountX;
    int amount;

    // Constructor to initiate this thread
    TransactionDeposite (Account x, int amount) {
        accountX = x;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        accountX.deposite(amount);
    }
}

// To implement a thread for withdraw
class TransactionWithdraw implements Runnable {
    Account accountY;
    int amount;

    // Constructor to initiate this thread
    TransactionWithdraw (Account y, int amount) {
        accountY = y;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        accountY.withdraw(amount);
    }
}

// Main class
public class Program5 {

    public static void main(String[] args){
        // Create an account
        Account ab = new Account();
        
        // initialize the account by Rs 1000
        ab.balance = 1000;
        
        // a thread for deposite
        TransactionDeposite t1;
        // another thread for withdraw
        TransactionWithdraw t2;
        
        // Two threads are started
        t1 = new TransactionDeposite(ab, 500);
        t2 = new TransactionWithdraw(ab, 900);
    }
}



