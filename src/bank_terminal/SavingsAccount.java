package bank_terminal;

public class SavingsAccount extends Account{
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            // Выкидываем ошибку
            throw new InsufficientFundsException("Недостаточно средств!");
        }
        updateBalance(-amount);
    }
}
