interface A {
    default void print() {
        System.out.println("Метод из интерфейса A");
    }
}

interface B {
    default void print() {
        System.out.println("Метод из интерфейса B");
    }
}

// Конфликт! Класс не скомпилируется без переопределения
class MyClass implements A, B {
    
    // Решение: переопределить метод и выбрать нужную реализацию
    @Override
    public void print() {
        System.out.println("Свой метод в классе");
        
        // Можно вызвать метод конкретного интерфейса
        A.super.print();   // Вызов метода из интерфейса A
        B.super.print();   // Вызов метода из интерфейса B
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();
    }
}