import java.util.Scanner;

class Account {
    private String accountNo;
    protected double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully.");
            return true;
        }
        System.out.println("Insufficient balance.");
        return false;
    }

    public void checkBalance() {
        System.out.println("Account " + accountNo + " balance: " + balance);
    }
}

class Savings extends Account {
    private double interestRate;

    public Savings(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
        System.out.println("Interest of " + interest + " applied at " + interestRate + "%.");
    }
}

class Current extends Account {
    private double overdraftLimit;

    public Current(String accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        double available = balance + overdraftLimit;
        if (amount <= available) {
            balance -= amount;
            if (balance < 0) {
                System.out.println("Using overdraft for " + (-balance) + " amount.");
            }
            System.out.println("Withdrawn " + amount + " successfully.");
            return true;
        }
        System.out.println("Withdrawal exceeds overdraft limit.");
        return false;
    }
}

public class Program_14 {
    public static void main(String[] args) {
        Savings savings = new Savings("SAV123", 2000.0, 5.0);
        Current current = new Current("CUR456", 1000.0, 500.0);

        System.out.println("=== Savings Account ===");
        savings.checkBalance();
        savings.deposit(500);
        savings.withdraw(300);
        savings.applyInterest();
        savings.checkBalance();

        System.out.println("\n=== Current Account ===");
        current.checkBalance();
        current.withdraw(1300);
        current.deposit(200);
        current.checkBalance();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEnter withdraw amount for current account:");
            double amount = scanner.nextDouble();
            current.withdraw(amount);
            current.checkBalance();
        }
    }
}
