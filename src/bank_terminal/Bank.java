package bank_terminal;

public class Bank {

    public void transfer(Account from, Account to, double amount) {

        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Нельзя перевести отрицательную сумму или сумму равную 0!");
            }
            from.withdraw(amount);
            to.deposit(amount);
            BankLogger.logTransferSuccess(amount);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }
    }
}
