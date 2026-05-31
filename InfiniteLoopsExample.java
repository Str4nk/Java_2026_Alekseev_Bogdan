public class InfiniteLoopsExample {
    public static void main(String[] args) {
        
        // 1. Бесконечный цикл while
        System.out.println("Бесконечный while (закомментирован)");
        /*
        while(true) {
            System.out.println("Этот цикл никогда не остановится");
        }
        */
        
        // 2. Бесконечный цикл while с условием
        /*
        int x = 10;
        while(x > 0) {
            System.out.println("x всегда > 0, т.к. не меняется");
        }
        */
        
        // 3. Бесконечный цикл do-while
        System.out.println("Бесконечный do-while (закомментирован)");
        /*
        do {
            System.out.println("Выполнится бесконечно");
        } while(true);
        */
        
        // 4. Бесконечный do-while с условием, которое всегда true
        /*
        int y = 5;
        do {
            System.out.println("y = " + y);
            // забыли изменить y
        } while(y == 5);
        */
        
        // Пример с управляемым выходом через break
        int counter = 0;
        while(true) {
            System.out.println("Итерация: " + counter);
            counter++;
            if(counter >= 5) {
                break;  // выход из бесконечного цикла
            }
        }
        System.out.println("Цикл завершен\n");
        
        // Пример с do-while
        int count = 0;
        do {
            System.out.println("do-while итерация: " + count);
            count++;
            if(count >= 3) {
                break;
            }
        } while(true);
        System.out.println("do-while цикл завершен");
    }
}