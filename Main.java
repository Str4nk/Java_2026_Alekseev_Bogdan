// Собственное исключение
class InvalidAgeException extends Exception {
    
    // Конструктор 1: без параметров
    public InvalidAgeException() {
        super("Недопустимый возраст");
    }
    
    // Конструктор 2: с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Конструктор 3: с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Второе собственное исключение
class InsufficientFundsException extends Exception {
    
    private double amount;
    
    public InsufficientFundsException() {
        super("Недостаточно средств");
    }
    
    public InsufficientFundsException(String message) {
        super(message);
    }
    
    public InsufficientFundsException(double amount) {
        super("Недостаточно средств. Не хватает: " + amount);
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
}

// Использование исключений
class Person {
    private int age;
    
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст " + age + " недопустим");
        }
        this.age = age;
        System.out.println("Возраст установлен: " + age);
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Снято: " + amount + ", остаток: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Собственное исключение InvalidAgeException ===\n");
        
        Person person = new Person();
        
        try {
            person.setAge(25);  // Корректный возраст
            person.setAge(200); // Некорректный возраст
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        System.out.println("\n=== Собственное исключение InsufficientFundsException ===\n");
        
        BankAccount account = new BankAccount(1000);
        
        try {
            account.withdraw(500);  // Достаточно средств
            account.withdraw(800);  // Недостаточно средств
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Не хватает: " + e.getAmount());
        }
    }
}