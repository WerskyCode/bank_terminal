package bank_terminal;

public class Main {
    public static void main(String[] args) {
        // Создаем аккаунты 2-х видов
        var savingsAccount = new SavingsAccount("123456", 20000);
        var creditAccount = new CreditAccount("123", 10000, 20000);
        var bank = new Bank();

        final double ZERO = 0;
        final double _5K = 5000;
        final double _500K = 500000;
        final double N5K = -5000;

        // 1. Перевод 5000 со сберегательного счета на кредитный.
        // Успешный перевод
        bank.transfer(savingsAccount, creditAccount, _5K);

        // 2. Перевод 500000 со сберегательного счета на кредитный.
        // Ошибка количества средств
        bank.transfer(savingsAccount, creditAccount, _500K);


        // 3. Перевод 500000 с кредитного счета на сберегательный.
        // Ошибка количества средств
        bank.transfer(creditAccount, savingsAccount, _500K);

        // 4. Перевод -5000 со сберегательного счета на кредитный.
        // Ошибка неправильного ввода данных
        bank.transfer(savingsAccount, creditAccount, N5K);

        // 5. Перевод -5000 с кредитного счета на сберегательный.
        // Ошибка неправильного ввода данных
        bank.transfer(creditAccount, savingsAccount, N5K);

        // 6. Перевод 0 со сберегательного счета на кредитный.
        // Ошибка неправильного ввода данных
        bank.transfer(savingsAccount, creditAccount, ZERO);

        // Вывод балансов всех аккаунтов
        BankLogger.printBalanceReport(savingsAccount, creditAccount);
    }
}
