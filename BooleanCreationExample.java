public class BooleanCreationExample {
    public static void main(String[] args) {
        
        // 1. Использование конструкторов (устаревший способ, но работает)
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean(false);
        Boolean bool3 = new Boolean("true");
        Boolean bool4 = new Boolean("false");
        Boolean bool5 = new Boolean("TrUe");   // регистронезависимо -> true
        Boolean bool6 = new Boolean("abc");    // не true -> false
        
        // 2. Использование статического метода valueOf() (рекомендуемый способ)
        Boolean bool7 = Boolean.valueOf(true);
        Boolean bool8 = Boolean.valueOf(false);
        Boolean bool9 = Boolean.valueOf("true");
        Boolean bool10 = Boolean.valueOf("false");
        Boolean bool11 = Boolean.valueOf("TrUe");  // регистронезависимо -> true
        
        // 3. Использование статических полей TRUE/FALSE (получение закешированных экземпляров)
        Boolean bool12 = Boolean.TRUE;
        Boolean bool13 = Boolean.FALSE;
        
        // 4. Автоупаковка (boxing)
        Boolean bool14 = true;   // автоматически преобразуется в Boolean.valueOf(true)
        Boolean bool15 = false;
        
        // 5. Парсинг строки через метод parseBoolean() (возвращает примитив)
        boolean primitive1 = Boolean.parseBoolean("true");
        boolean primitive2 = Boolean.parseBoolean("false");
        Boolean bool16 = primitive1;  // затем автоупаковка
        
        // Проверка, что valueOf использует кеш
        System.out.println("valueOf(true) == Boolean.TRUE: " + (Boolean.valueOf(true) == Boolean.TRUE));
        System.out.println("valueOf(false) == Boolean.FALSE: " + (Boolean.valueOf(false) == Boolean.FALSE));
    }
}