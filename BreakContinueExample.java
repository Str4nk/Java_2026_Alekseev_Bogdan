public class BreakContinueExample {
    public static void main(String[] args) {
        
        System.out.println("break");
        // break - полный выход из цикла
        for(int i = 1; i <= 10; i++) {
            if(i == 6) {
                System.out.println("Достигнуто i=6, выходим из цикла");
                break;  // цикл прекращается
            }
            System.out.println("i = " + i);
        }
        
        System.out.println("\ncontinue");
        // continue - пропуск текущей итерации
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                continue;  // пропускаем четные числа
            }
            System.out.println("Нечетное число: " + i);
        }
        
        System.out.println("\nbreak в while");
        int num = 1;
        while(num <= 20) {
            if(num == 15) {
                System.out.println("Достигнуто 15, остановка");
                break;
            }
            System.out.print(num + " ");
            num++;
        }
        
        System.out.println("\n\ncontinue в while");
        int count = 0;
        while(count < 10) {
            count++;
            if(count == 5) {
                System.out.println("Пропускаем 5");
                continue;
            }
            System.out.print(count + " ");
        }
        
        System.out.println("\n\nbreak в do-while ");
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
            if(x == 8) {
                System.out.println("\nДостигнуто 8, выход");
                break;
            }
        } while(x <= 10);
        
        System.out.println("\ncontinue в do-while");
        int y = 0;
        do {
            y++;
            if(y == 4 || y == 7) {
                System.out.println("Пропускаем " + y);
                continue;
            }
            System.out.print(y + " ");
        } while(y < 10);
        
        System.out.println("\n\nbreak во вложенных циклах");
        // break выходит только из внутреннего цикла
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j == 3) {
                    break;  // выходит только из цикла по j
                }
                System.out.println("i=" + i + ", j=" + j);
            }
            System.out.println("завершили внутренний цикл для i=" + i);
        }
        
        System.out.println("\ncontinue во вложенных циклах ");
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j == 3) {
                    continue;  // пропускает j=3
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        System.out.println("\n=break с меткой ");
        // Использование метки для выхода из внешнего цикла
        outer: for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == 2 && j == 3) {
                    System.out.println("Выходим из обоих циклов");
                    break outer;  // выходит из цикла с меткой outer
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}