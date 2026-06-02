package package2;

public class TestDifferentPackage {
    public static void main(String[] args) {
        System.out.println("=== ПРОВЕРКА ДОСТУПА ИЗ package2 ===");
        
        // Тест из подкласса
        Child child = new Child();
        child.testAccess();
        child.showPrivateAccess();
        
        // Тест из обычного класса в другом пакете
        DifferentPackage dp = new DifferentPackage();
        dp.testAccess();
    }
}