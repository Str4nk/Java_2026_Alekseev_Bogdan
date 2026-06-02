import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        // Создаем файл test.txt с содержимым "Hello"
        
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            
            // read() читает один байт и возвращает его значение (0-255)
            // при достижении конца файла возвращает -1
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Преобразуем байт в символ
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}