package bank_terminal;

import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankLogger {
    private static final DateTimeFormatter formattedPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logTransferError(Exception e) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(formattedPattern);
        System.out.println("ОШИБКА ПЕРЕВОДА!");
        System.out.println("Время: " + formattedDate);
        System.out.println("Причина: " + e.getMessage());
        System.out.println();
    }

    public static void logTransferSuccess(double amount) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(formattedPattern);
        System.out.println("Перевод выполнен успешно!");
        System.out.println("Сумма перевода " + amount);
        System.out.println("Время: " + formattedDate);
        System.out.println();
    }

    public static void printBalanceReport(Account... accounts) {
        System.out.println("         ---Балансы---");
        List.of(accounts)
                .forEach(account -> System.out.printf("ID: %10s | Balance: %10.2f\n",
                        account.getAccountNumber(),
                        account.getBalance()));
        System.out.println();
    }

}
