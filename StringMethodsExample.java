public class StringMethodsExample {
    public static void main(String[] args) {
        
        String str = "   Hello Java World!   ";
        String str2 = "hello java world!";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length()); // 22
        
        // 2. trim() - удаляет пробелы в начале и конце
        System.out.println("2. trim(): '" + str.trim() + "'"); // 'Hello Java World!'
        
        // 3. toLowerCase() / toUpperCase() - преобразование регистра
        System.out.println("3. toLowerCase(): " + str.toLowerCase());
        System.out.println("   toUpperCase(): " + str.toUpperCase());
        
        // 4. charAt() - возвращает символ по индексу
        System.out.println("4. charAt(6): " + str.charAt(6)); // 'J'
        
        // 5. indexOf() - ищет индекс первого вхождения
        System.out.println("5. indexOf('J'): " + str.indexOf('J')); // 6
        
        // 6. substring() - выделяет подстроку
        System.out.println("6. substring(6, 11): " + str.substring(6, 11)); // "Java"
        
        // 7. replace() - заменяет символы
        System.out.println("7. replace('o', '0'): " + str.replace('o', '0')); // Hell0 Java W0rld!
        
        // 8. equals() и equalsIgnoreCase() - сравнение строк
        System.out.println("8. equals(): " + str.trim().equals(str2)); // false
        System.out.println("   equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(str2)); // true
        
        // 9. contains() - проверяет наличие подстроки
        System.out.println("9. contains('Java'): " + str.contains("Java")); // true
        
        // 10. split() - разбивает строку на массив
        System.out.println("10. split(): ");
        String[] words = str.trim().split(" ");
        for (String word : words) {
            System.out.println("    " + word);
        }
    }
}