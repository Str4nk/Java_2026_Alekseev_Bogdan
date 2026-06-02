package package2;

import package1.Parent;

public class DifferentPackage {
    
    public void testAccess() {
        Parent p = new Parent();
        
        System.out.println("\n=== Доступ из обычного класса в другом пакете ===");
        
        // private - НЕ ДОСТУПЕН
        // System.out.println(p.privateField);  // Ошибка!
        
        // default - НЕ ДОСТУПЕН (другой пакет)
        // System.out.println(p.defaultField);  // Ошибка!
        
        // protected - НЕ ДОСТУПЕН (только для подклассов!)
        // System.out.println(p.protectedField);  // Ошибка!
        // protected работает только через наследование, а не через экземпляр
        
        // public - ДОСТУПЕН
        System.out.println("publicField: " + p.publicField);  // OK - 40
        
        // Доступ к private через публичный метод
        System.out.println("privateField (через getter): " + p.getPrivateField());
    }
}