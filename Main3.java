interface Vehicle {
    
    // Абстрактный метод (должен быть реализован в классе)
    void start();
    
    // Неабстрактный (default) метод
    default void stop() {
        System.out.println("Транспорт остановлен");
    }
    
    // Статический метод
    static void info() {
        System.out.println("Это интерфейс Vehicle");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Машина завелась");
    }
    
    // Можно переопределить default метод, но не обязательно
    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Велосипед поехал");
    }
    // stop() не переопределяем - используем реализацию по умолчанию
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        
        // Способы вызова:
        System.out.println("=== Вызов методов ===");
        
        // 1. Вызов абстрактного метода (реализованного в классе)
        car.start();
        bike.start();
        
        // 2. Вызов default метода (через объект)
        car.stop();
        bike.stop();  // используется реализация из интерфейса
        
        // 3. Вызов статического метода (только через имя интерфейса)
        Vehicle.info();
        
        // Неправильно: car.info(); // Ошибка! static метод через объект нельзя
    }
}