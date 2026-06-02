import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Пример 1: Свой класс с AutoCloseable
class CustomResource implements AutoCloseable {
    
    public void doWork() {
        System.out.println("Выполнение работы...");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Ресурс закрыт автоматически");
    }
}

// Пример 2: try-with-resources с несколькими ресурсами
public class AutoCloseableExample {
    public static void main(String[] args) {
        
        // Старый способ (до Java 7)
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            // работа с файлом
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close(); // нужно явно закрывать
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Новый способ (Java 7+) - try-with-resources
        try (FileInputStream fis2 = new FileInputStream("file.txt");
             FileOutputStream fos = new FileOutputStream("out.txt")) {
            
            // ресурсы закроются автоматически после try
            int data;
            while ((data = fis2.read()) != -1) {
                fos.write(data);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Пример с собственным ресурсом
        try (CustomResource resource = new CustomResource()) {
            resource.doWork();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Зачем нужен: Позволяет автоматически закрывать ресурсы (файлы, сетевые соединения, БД) с помощью конструкции try-with-resources.
    }
}
