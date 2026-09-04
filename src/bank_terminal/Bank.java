package bank_terminal;

/* 04.09.2026
 * 1. Убран блок try-catch в методе transfer.
 * Он перенесен в main. Тут только логика банка без логирования.
 * 2. Убраны импорты java.time.
 * Для реализации логирования создан отдельный класс BankLogger.
 */

public class Bank {

    public void transfer(Account from, Account to, double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException("Нельзя перевести отрицательную сумму или сумму равную 0!");
        }

        from.withdraw(amount);
        to.deposit(amount);
    }
}
