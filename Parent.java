package package1;

public class Parent {
    // 1. private - доступен только внутри этого класса
    private int privateField = 10;
    
    // 2. default (package-private) - доступен внутри пакета
    int defaultField = 20;
    
    // 3. protected - доступен внутри пакета + подклассам в других пакетах
    protected int protectedField = 30;
    
    // 4. public - доступен везде
    public int publicField = 40;
    
    // Метод для демонстрации доступа private внутри класса
    public void showPrivateAccess() {
        System.out.println("Доступ к private внутри класса: " + privateField);
    }
    
    // Метод для демонстрации доступа private через getter
    public int getPrivateField() {
        return privateField;  // private доступен внутри класса
    }
}