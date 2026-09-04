package bank_terminal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * 04.09.2026
 * 1. Для реализации логирования создан класс BankLogger.
 */

public class BankLogger {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formattedPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


}
