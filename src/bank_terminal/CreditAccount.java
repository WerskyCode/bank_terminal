package bank_terminal;

public class CreditAccount extends Account{
    private double creditLimit;

    CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    // Не делаю кредитный лимит final, ведь он мог быть изменен при определенных условиях (алгоритм)
    void changeCreditLimit() {
        // Сам алгоритм
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -creditLimit) {
            throw new InsufficientFundsException("Недостаточно средств!");
        }
        updateBalance(-amount);
    }
}
