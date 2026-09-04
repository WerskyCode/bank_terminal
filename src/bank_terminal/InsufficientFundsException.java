package bank_terminal;

// Ошибки связанные с недостаточным количеством средств (для переводов или снятий со счета)
public class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(String message) {
        super(message);
    }
}
