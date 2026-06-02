import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        
        // Пример 1: Простое объединение с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко");
        sj1.add("Банан");
        sj1.add("Апельсин");
        System.out.println("Фрукты: " + sj1);
        
        // Пример 2: С префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Красный");
        sj2.add("Зеленый");
        sj2.add("Синий");
        System.out.println("Цвета: " + sj2);
        
        // Пример 3: Объединение двух StringJoiner
        StringJoiner names1 = new StringJoiner(", ");
        names1.add("Иван");
        names1.add("Петр");
        
        StringJoiner names2 = new StringJoiner(", ");
        names2.add("Мария");
        names2.add("Анна");
        
        names1.merge(names2);
        System.out.println("Имена: " + names1);
        
        // Пример 4: Пустой StringJoiner
        StringJoiner empty = new StringJoiner(", ", "{", "}");
        System.out.println("Пустой: " + empty);
        System.out.println("Длина: " + empty.length());
    }
}