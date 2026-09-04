package bank_terminal;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 20000);
        CreditAccount creditAccount = new CreditAccount("123", 10000, 20000);
        Bank bank = new Bank();

        try {
            bank.transfer(savingsAccount, creditAccount, 5000);
            BankLogger.logTransferAccess(savingsAccount);
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        try {
            bank.transfer(savingsAccount, creditAccount, 500000);
            System.out.println(savingsAccount.getBalance());
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        try {
            bank.transfer(creditAccount, savingsAccount, 500000);
            System.out.println(creditAccount.getBalance());
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }

        try {
            bank.transfer(savingsAccount, creditAccount, -5000);
            System.out.println(savingsAccount.getBalance());
            System.out.println(creditAccount.getBalance());
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }
        System.out.println(savingsAccount.getBalance());
        System.out.println(creditAccount.getBalance());

        try {
            bank.transfer(creditAccount, savingsAccount, -5000);
            System.out.println(savingsAccount.getBalance());
            System.out.println(creditAccount.getBalance());
        } catch (Exception e) {
            BankLogger.logTransferError(e);
        }
        System.out.println(savingsAccount.getBalance());
        System.out.println(creditAccount.getBalance());
    }
}
