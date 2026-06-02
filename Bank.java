public class Bank {
    private double balance = 1000;
    protected String owner = "Иван";
    public String bankName = "Сбербанк";
    String address = "Москва";
    
    private void secretMethod() {
        System.out.println("Секретный метод банка");
    }
    
    public class Transaction {
        
        public void processPayment(double amount) {
            // Внутренний класс имеет доступ к ЛЮБЫМ полям внешнего класса
            System.out.println("Банк: " + bankName);      // public 
            System.out.println("Владелец: " + owner);     // protected 
            System.out.println("Баланс: " + balance);     // private 
            System.out.println("Адрес: " + address);      // default
            
            balance -= amount;  // Изменяем private поле внешнего класса
            
            secretMethod();      // Вызываем private метод внешнего класса
        }
        
        public void showBalance() {
            System.out.println("Текущий баланс: " + balance);
        }
    }
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Transaction transaction = bank.new Transaction();
        
        transaction.processPayment(200);
        transaction.showBalance();  // 800
    }
}