import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient amount Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdraw $" + amount + ". New balance: $" + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void withdraw(double amount) {
        userAccount.withdraw(amount);
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public void checkBalance() {
        userAccount.checkBalance();
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage:
        BankAccount userAccount = new BankAccount(10000);
        ATM atmMachine = new ATM(userAccount);

        atmMachine.withdraw(1500); // Successful withdrawal
        atmMachine.checkBalance(); // Display current balance
        atmMachine.deposit(2300); // Successful deposit
        atmMachine.withdraw(1500); // Insufficient funds message

        scanner.close();
    }
}
    

