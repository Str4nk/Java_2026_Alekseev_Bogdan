public class OuterClass {
    
    // 1. public - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner: доступен из любого места");
        }
    }
    
    // 2. private - доступен только внутри внешнего класса
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner: доступен только внутри OuterClass");
        }
    }
    
    // 3. protected - доступен внутри пакета и подклассам
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner: доступен в пакете и подклассам");
        }
    }
    
    // 4. default (без спецификатора) - доступен только внутри пакета
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner: доступен только внутри пакета");
        }
    }
    
    public void testAccess() {
        // Внутри внешнего класса доступны все внутренние классы
        PublicInner pi = new PublicInner();
        PrivateInner pri = new PrivateInner();
        ProtectedInner pro = new ProtectedInner();
        DefaultInner di = new DefaultInner();
        
        pi.show();
        pri.show();
        pro.show();
        di.show();
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.testAccess();
        
        // Создание объектов внутренних классов извне
        PublicInner pi = outer.new PublicInner();  // ✅ public - доступно
        // PrivateInner pri = outer.new PrivateInner();  // ❌ private - недоступно
        // ProtectedInner pro = outer.new ProtectedInner(); // ⚠️ только в том же пакете
        // DefaultInner di = outer.new DefaultInner();     // ⚠️ только в том же пакете
    }
}