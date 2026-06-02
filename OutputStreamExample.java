import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            
            // write(int) записывает один байт (младшие 8 бит)
            fos.write(72);  // 'H'
            fos.write(101); // 'e'
            fos.write(108); // 'l'
            fos.write(108); // 'l'
            fos.write(111); // 'o'
            
            System.out.println("Данные записаны в файл");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}