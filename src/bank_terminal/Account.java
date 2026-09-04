package bank_terminal;

public abstract class Account implements AccountOperations {
    private final String accountNumber; // Номер лицевого счета.
    private double balance; // Баланс. Компилятор предлагает аналогичное.

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    protected void updateBalance(double amount) {
        // Метод смены баланса
        // Проверки отрицательного баланса нет, она должна быть в самих методах снятия
        // (можно добавить обязательное исключение хз пока как)
        balance += amount;
    }

    // Перезаписанные методы интерфейса действий аккаунта
    @Override
    public double getBalance() { // Тут я облажался забыл про private, но исправил.
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Нельзя внести отрицательную сумму!");
        }
        updateBalance(amount);
    }
}
