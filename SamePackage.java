package package1;

public class SamePackage {
    
    public void testAccess() {
        Parent p = new Parent();
        
        System.out.println("\n=== Доступ из класса в том же пакете ===");
          
        // default - ДОСТУПЕН (в том же пакете)
        System.out.println("defaultField: " + p.defaultField);     // OK - 20
        
        // protected - ДОСТУПЕН (в том же пакете)
        System.out.println("protectedField: " + p.protectedField);  // OK - 30
        
        // public - ДОСТУПЕН
        System.out.println("publicField: " + p.publicField);        // OK - 40
        
        // Доступ к private через публичный метод
        System.out.println("privateField (через getter): " + p.getPrivateField());
    }
}