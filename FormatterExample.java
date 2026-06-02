import java.util.Formatter;
import java.util.Date;

public class FormatterExample {
    public static void main(String[] args) {
        
        // Создание Formatter
        Formatter formatter = new Formatter();
        
        // 1. %d - десятичное целое число
        formatter.format("1. Целое число: %d\n", 100);
        
        // 2. %f - число с плавающей точкой
        formatter.format("2. Число с плавающей точкой: %.2f\n", 3.14159);
        
        // 3. %s - строковое представление
        formatter.format("3. Строка: %s\n", "Привет, мир!");
        
        // 4. %b - логическое значение
        formatter.format("4. Логическое значение: %b\n", true);
        
        // 5. %c - символ
        formatter.format("5. Символ: %c\n", 'A');
        
        // 6. %n - новая строка
        formatter.format("6. Пример с %%n: новая строка%n");
        
        // 7. %% - вывод знака процента
        formatter.format("7. Вывод процента: 50%%\n");
        
        // 8. %h - хэшкод
        formatter.format("8. Хэшкод строки: %h\n", "Hello");
        
        // 9. %e - экспоненциальная форма
        formatter.format("9. Экспоненциальная форма: %e\n", 12345.67);
        
        System.out.println(formatter.toString());
        formatter.close();
    }
}