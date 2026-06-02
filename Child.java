package package2;

import package1.Parent;

public class Child extends Parent {
    
    public void testAccess() {
        System.out.println("\n=== Доступ из подкласса в другом пакете ===");
        
        // private - НЕ ДОСТУПЕН
        // System.out.println(privateField);  // Ошибка!
        
        // default - НЕ ДОСТУПЕН (другой пакет)
        // System.out.println(defaultField);  // Ошибка!
        
        // protected - ДОСТУПЕН (через наследование)
        System.out.println("protectedField: " + protectedField);  // OK - 30
        
        // public - ДОСТУПЕН
        System.out.println("publicField: " + publicField);        // OK - 40
        
        // Доступ к private через унаследованный метод
        System.out.println("privateField (через getter): " + getPrivateField());
    }
    
    // Демонстрация переопределения метода с protected
    @Override
    protected void showPrivateAccess() {
        System.out.println("Переопределенный метод в Child");
    }
}