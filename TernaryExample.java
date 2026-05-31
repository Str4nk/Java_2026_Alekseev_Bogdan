public class TernaryExample {
    public static void main(String[] args) {
        
        // Проверка для разных значений a
        int a = 1;
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("a = 1 -> i = " + i);  // 1
        
        a = 2;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("a = 2 -> i = " + i);  // 2
        
        a = 5;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("a = 5 -> i = " + i);  // 3
    }
}