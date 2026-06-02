import java.util.Formatter;
import java.util.Date;
import java.util.Calendar;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        
        Date now = new Date();
        Formatter f = new Formatter();
        
        // 1. %tH - час (00-23)
        f.format("1. Час (24-часовой): %tH\n", now);
        
        // 2. %tI - час (01-12)
        f.format("2. Час (12-часовой): %tI\n", now);
        
        // 3. %tM - минуты
        f.format("3. Минуты: %tM\n", now);
        
        // 4. %tS - секунды
        f.format("4. Секунды: %tS\n", now);
        
        // 5. %tY - год (4 цифры)
        f.format("5. Год: %tY\n", now);
        
        // 6. %ty - год (2 цифры)
        f.format("6. Год (2 цифры): %ty\n", now);
        
        // 7. %tB - полное название месяца
        f.format("7. Месяц: %tB\n", now);
        
        // 8. %tm - месяц цифрой
        f.format("8. Месяц (цифра): %tm\n", now);
        
        // 9. %tA - полное название дня недели
        f.format("9. День недели: %tA\n", now);
        
        // 10. Комбинированное форматирование
        f.format("\n=== Полная дата и время ===\n");
        f.format("%tA, %td %tB %tY, %tH:%tM:%tS\n", now, now, now, now, now, now, now);
        
        System.out.println(f.toString());
        f.close();
    }
}