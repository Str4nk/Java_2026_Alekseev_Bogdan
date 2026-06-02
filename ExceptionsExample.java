public class ExceptionsExample {
    
    // 1. ArithmeticException - арифметическая ошибка (деление на ноль)
    public static void arithmeticExceptionExample() {
        System.out.println("\n=== ArithmeticException ===");
        try {
            int result = 10 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль! " + e.getMessage());
        }
    }
    
    // 2. ArrayIndexOutOfBoundsException - выход за границы массива
    public static void arrayIndexOutOfBoundsExample() {
        System.out.println("\n=== ArrayIndexOutOfBoundsException ===");
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Элемент с индексом 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за границы массива!");
        }
    }
    
    // 3. IllegalArgumentException - неверный аргумент метода
    public static void illegalArgumentExceptionExample() {
        System.out.println("\n=== IllegalArgumentException ===");
        
        // Метод, который проверяет возраст
        class Person {
            void setAge(int age) {
                if (age < 0 || age > 150) {
                    throw new IllegalArgumentException("Возраст должен быть от 0 до 150");
                }
                System.out.println("Возраст установлен: " + age);
            }
        }
        
        try {
            Person p = new Person();
            p.setAge(200); // Неверный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    
    // 4. ClassCastException - неверное приведение типов
    public static void classCastExceptionExample() {
        System.out.println("\n=== ClassCastException ===");
        try {
            Object obj = "Это строка";
            Integer num = (Integer) obj; // Нельзя привести String к Integer
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Неверное приведение типов!");
        }
    }
    
    // 5. NullPointerException - обращение к null объекту
    public static void nullPointerExceptionExample() {
        System.out.println("\n=== NullPointerException ===");
        try {
            String str = null;
            int length = str.length(); // Обращение к null
            System.out.println("Длина строки: " + length);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка обратиться к null объекту!");
        }
    }
    
    public static void main(String[] args) {
        arithmeticExceptionExample();
        arrayIndexOutOfBoundsExample();
        illegalArgumentExceptionExample();
        classCastExceptionExample();
        nullPointerExceptionExample();
    }
}