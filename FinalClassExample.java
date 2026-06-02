public class FinalClassExample {
    
    static final class MathConstants {
        public double getPi() {
            return 3.14159;
        }
    }
    
    public static void main(String[] args) {
        MathConstants mc = new MathConstants();
        System.out.println("Pi = " + mc.getPi());
        System.out.println("final-класс нельзя расширить");
    }
}