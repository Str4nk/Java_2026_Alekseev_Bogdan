public class SimpleOperators {
    public static void main(String[] args) {
        
        // Присваивания
        int a = 10;
        a += 5;  // a = 15
        a -= 3;  // a = 12
        a *= 2;  // a = 24
        a /= 4;  // a = 6
        a %= 2;  // a = 0
        
        // Тернарный оператор
        int age = 20;
        String result = (age >= 18) ? "Взрослый" : "Ребенок";
        
        // Логические
        boolean x = true, y = false;
        System.out.println(x || y);  // true (ИЛИ)
        System.out.println(x && y);  // false (И)
        System.out.println(x | y);   // true
        System.out.println(x ^ y);   // true (исключающее ИЛИ)
        System.out.println(x & y);   // false
        
        // Сравнения
        int n1 = 5, n2 = 10;
        System.out.println(n1 == n2);  // false
        System.out.println(n1 != n2);  // true
        System.out.println(n1 > n2);   // false
        System.out.println(n1 < n2);   // true
        System.out.println(n1 >= 5);   // true
        System.out.println(n1 <= 5);   // true
        
        // Сдвиги
        int num = 8;
        System.out.println(num >> 1);  // 4 (деление на 2)
        System.out.println(num << 1);  // 16 (умножение на 2)
        
        // Арифметика
        int p = 10, q = 3;
        System.out.println(p + q);  // 13
        System.out.println(p - q);  // 7
        System.out.println(p * q);  // 30
        System.out.println(p / q);  // 3 (целое деление)
        System.out.println(p % q);  // 1 (остаток)
        
        // Инкремент/декремент
        int c = 5;
        System.out.println(c++);  // 5 (постфикс: сначала выведи, потом увеличь)
        System.out.println(c);    // 6
        System.out.println(++c);  // 7 (префикс: сначала увеличь, потом выведи)
        System.out.println(c--);  // 7
        System.out.println(--c);  // 5
        
        // String конкатенация
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);  // Hello World
        
        String text = "Java";
        text += "!";
        System.out.println(text);  // Java!
        
        // Побитовые
        int bit = 5;  // 0101
        System.out.println(~bit);  // -6 (инверсия)
        System.out.println(!true); // false
    }
}