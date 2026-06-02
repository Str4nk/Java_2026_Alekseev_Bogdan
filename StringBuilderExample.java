public class StringBuilderExample {
    public static void main(String[] args) {
        
        // Создание объекта StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append(): " + sb); // Hello World
        
        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, " beautiful");
        System.out.println("2. insert(): " + sb); // Hello beautiful World
        
        // 3. delete() - удаляет символы от start до end
        sb.delete(5, 15);
        System.out.println("3. delete(): " + sb); // Hello World
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(): " + sb); // HelloWorld
        
        // 5. replace() - заменяет часть строки
        sb.replace(5, 10, " Java");
        System.out.println("5. replace(): " + sb); // Hello Java
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse(): " + sb); // avaJ olleH
        
        sb.reverse(); // вернем обратно
        
        // 7. length() - возвращает длину
        System.out.println("7. length(): " + sb.length()); // 10
        
        // 8. charAt() - возвращает символ по индексу
        System.out.println("8. charAt(0): " + sb.charAt(0)); // H
        
        // 9. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("9. setCharAt(): " + sb); // hello Java
        
        // 10. substring() - возвращает подстроку
        String sub = sb.substring(6, 10);
        System.out.println("10. substring(): " + sub); // Java
        
        // 11. indexOf() - ищет индекс подстроки
        System.out.println("11. indexOf('Java'): " + sb.indexOf("Java")); // 6
        
        // 12. capacity() - возвращает текущую вместимость
        System.out.println("12. capacity(): " + sb.capacity()); // 21
        
        // 13. toString() - преобразует в String
        String result = sb.toString();
        System.out.println("13. toString(): " + result);
    }
}