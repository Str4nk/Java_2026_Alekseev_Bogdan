import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        
        // Пример 1: Чтение всех данных из файла
        System.out.println("=== Чтение файла целиком ===");
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        
        // Пример 2: Чтение чисел из файла
        System.out.println("\n=== Чтение чисел из файла ===");
        try (Scanner scanner = new Scanner(new File("numbers.txt"))) {
            
            int sum = 0;
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println("Число: " + num);
                sum += num;
            }
            System.out.println("Сумма: " + sum);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // Пример 3: Чтение с разделителями
        System.out.println("\n=== Чтение с разделителями ===");
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            
            // Установка разделителя (запятая или пробел)
            scanner.useDelimiter("[,\\s]+");
            
            while (scanner.hasNext()) {
                String token = scanner.next();
                System.out.println("Токен: " + token);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // Пример 4: Проверка типа данных перед чтением
        System.out.println("\n=== Проверка типа данных ===");
        try (Scanner scanner = new Scanner(new File("mixed.txt"))) {
            
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.println("Целое число: " + scanner.nextInt());
                } else if (scanner.hasNextDouble()) {
                    System.out.println("Дробное число: " + scanner.nextDouble());
                } else {
                    System.out.println("Строка: " + scanner.next());
                }
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}