package bank_terminal;

public class Main {
    public static void main(String[] args) {
        // Создаем аккаунты 2-х видов
        SavingsAccount savingsAccount = new SavingsAccount("123456", 20000);
        CreditAccount creditAccount = new CreditAccount("123", 10000, 20000);
        Bank bank = new Bank();

        final double ZERO = 0;
        final double _5K = 5000;
        final double _500K = 500000;
        final double N5K = -5000;

        // 1. Перевод 5000 со сберегательного счета на кредитный.
        // Успешный перевод
        try {
            bank.transfer(savingsAccount, creditAccount, _5K);
            BankLogger.logTransferSuccess(_5K);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        // 2. Перевод 500000 со сберегательного счета на кредитный.
        // Ошибка количества средств
        try {
            bank.transfer(savingsAccount, creditAccount, _500K);
            BankLogger.logTransferSuccess(_500K);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        // 3. Перевод 500000 с кредитного счета на сберегательный.
        // Ошибка количества средств
        try {
            bank.transfer(creditAccount, savingsAccount, _500K);
            BankLogger.logTransferSuccess(_500K);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        // 4. Перевод -5000 со сберегательного счета на кредитный.
        // Ошибка неправильного ввода данных
        try {
            bank.transfer(savingsAccount, creditAccount, N5K);
            BankLogger.logTransferSuccess(N5K);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        // 4. Перевод -5000 с кредитного счета на сберегательный.
        // Ошибка неправильного ввода данных
        try {
            bank.transfer(creditAccount, savingsAccount, N5K);
            BankLogger.logTransferSuccess(N5K);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        // 5. Перевод 0 со сберегательного счета на кредитный.
        // Ошибка неправильного ввода данных
        try {
            bank.transfer(savingsAccount, creditAccount, ZERO);
            BankLogger.logTransferSuccess(ZERO);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        // Вывод балансов всех аккаунтов
        BankLogger.printBalanceReport(savingsAccount, creditAccount);
    }
}
