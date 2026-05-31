public class NullPointerUnboxing {
    public static void main(String[] args) {
        
        // Пример 1: Прямое присваивание
        Integer a = null;
        // int b = a;  // NullPointerException!
        
        // Пример 2: Арифметическая операция
        Integer c = null;
        // Integer d = c + 10;  // NullPointerException! (c распаковывается)
        
        // Пример 3: Сравнение
        Integer e = null;
        // if (e == 5) { }  // NullPointerException! (e распаковывается)
        
        // Безопасный способ:
        Integer safe = null;
        if (safe != null) {
            int value = safe;  // распаковка только если не null
        }
    }
}
//NullPointerException будет брошен, когда объект-оболочка равен null, а JVM пытается автоматически преобразовать его в примитивный тип (распаковать).