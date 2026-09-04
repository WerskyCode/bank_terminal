package bank_terminal;

public class Bank {

    public void transfer(Account from, Account to, double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException("Нельзя перевести отрицательную сумму или сумму равную 0!");
        }

        from.withdraw(amount);
        to.deposit(amount);
    }
}
