package bank_terminal;

public interface AccountOperations { // throws{
    void deposit(double amount); // (количество) Пополнение счета.

    double getBalance(); // Геттер для получения баланса.

    void withdraw(double amount); // (отзывать) Снятие со счета.
    // Здесь может быть исключение в виде отрицательного баланса.
    // В дальнейшем учту это с помощью throws.
}
