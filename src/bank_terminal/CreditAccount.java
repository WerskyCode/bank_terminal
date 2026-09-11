package bank_terminal;

import java.time.LocalDate;

public class CreditAccount extends Account{
    private double creditLimit;
    private LocalDate creditLimitExpiration; // Дата окончания действия лимита. Дальше комиссия

    CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
        this.creditLimitExpiration = LocalDate.now().plusDays(30);
    }

    // Обновление кредитного лимита, если текущий баланс равен начальному
//    void returnCreditLimitExpiration(CreditAccount creditAccount) {
//        if (creditAccount.startBalance == getBalance()) {
//
//        }
//    }

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
