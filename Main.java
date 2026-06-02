package package1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРОВЕРКА ДОСТУПА ИЗ package1 ===");
        
        // Тест из родительского класса
        Parent p = new Parent();
        p.showPrivateAccess();
        
        // Тест из класса в том же пакете
        SamePackage sp = new SamePackage();
        sp.testAccess();
    }
}