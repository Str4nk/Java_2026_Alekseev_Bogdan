public class OverloadExample {
    
    static class MathUtils {
        
        // Перегруженные методы с одинаковым именем, но разными параметрами
        
        public int sum(int a, int b) {
            return a + b;
        }
        
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
        
        public double sum(double a, double b) {
            return a + b;
        }
        
        public String sum(String a, String b) {
            return a + b;
        }
    }
    
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        
        System.out.println(m.sum(5, 10));
        System.out.println(m.sum(5, 10, 15));
        System.out.println(m.sum(3.5, 2.5));
        System.out.println(m.sum("Hello", "World"));
    }
}