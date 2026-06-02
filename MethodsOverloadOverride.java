// ==================== ПЕРЕГРУЗКА МЕТОДОВ (OVERLOADING) ====================

class Calculator {
    
    // 1. Перегрузка по количеству параметров
    public int sum(int a, int b) {
        System.out.print("sum(int, int): ");
        return a + b;
    }
    
    public int sum(int a, int b, int c) {
        System.out.print("sum(int, int, int): ");
        return a + b + c;
    }
    
    // 2. Перегрузка по типу параметров
    public double sum(double a, double b) {
        System.out.print("sum(double, double): ");
        return a + b;
    }
    
    // 3. Перегрузка по порядку параметров
    public String sum(String a, int b) {
        System.out.print("sum(String, int): ");
        return a + b;
    }
    
    public String sum(int a, String b) {
        System.out.print("sum(int, String): ");
        return a + b;
    }
    
    // Перегрузка print
    public void print(int value) {
        System.out.println("print(int): " + value);
    }
    
    public void print(String value) {
        System.out.println("print(String): " + value);
    }
    
    public void print(boolean value) {
        System.out.println("print(boolean): " + value);
    }
}

// ==================== ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ (OVERRIDE) ====================

class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void makeSound() {
        System.out.println(name + " издает звук");
    }
    
    public void move() {
        System.out.println(name + " двигается");
    }
    
    public Animal getClone() {
        System.out.println("Animal.getClone()");
        return new Animal(name);
    }
    
    public final void cannotOverride() {
        System.out.println("Этот метод нельзя переопределить");
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " гавкает: Гав-гав!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " бегает и виляет хвостом");
    }
    
    @Override
    public Dog getClone() {
        System.out.println("Dog.getClone()");
        return new Dog(name, breed);
    }
}

class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " мяукает: Мяу-мяу!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " крадется тихо");
    }
}

// ==================== ДОПОЛНИТЕЛЬНЫЙ ПРИМЕР ====================

class StringHelper {
    public String join(String a, String b) {
        return a + b;
    }
    
    public String join(String a, String b, String c) {
        return a + b + c;
    }
    
    public String join(String a, int b) {
        return a + b;
    }
    
    public String join(int a, String b) {
        return a + b;
    }
}

// ==================== ПРИМЕР С ПОЛИМОРФИЗМОМ ====================

class Shape {
    public double getArea() {
        return 0;
    }
    
    public void draw() {
        System.out.println("Рисуем фигуру");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Рисуем круг радиусом " + radius);
    }
}

class Rectangle extends Shape {
    private double width, height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return width * height;
    }
    
    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник " + width + "x" + height);
    }
}

// ==================== ГЛАВНЫЙ КЛАСС ====================

public class MethodsOverloadOverride {
    public static void main(String[] args) {
        
        System.out.println("========== ПЕРЕГРУЗКА (OVERLOADING) ==========\n");
        
        Calculator calc = new Calculator();
        
        System.out.println("Результат: " + calc.sum(5, 10));
        System.out.println("Результат: " + calc.sum(5, 10, 15));
        System.out.println("Результат: " + calc.sum(5.5, 3.2));
        System.out.println("Результат: " + calc.sum("Число: ", 42));
        System.out.println("Результат: " + calc.sum(100, " рублей"));
        
        System.out.println("\n--- Перегрузка print ---");
        calc.print(100);
        calc.print("Hello Java!");
        calc.print(true);
        
        System.out.println("\n========== ПЕРЕОПРЕДЕЛЕНИЕ (OVERRIDE) ==========\n");
        
        Animal animal1 = new Animal("Животное");
        Animal animal2 = new Dog("Шарик", "Овчарка");
        Animal animal3 = new Cat("Мурка");
        
        System.out.println("--- Базовый класс ---");
        animal1.makeSound();
        animal1.move();
        
        System.out.println("\n--- Dog (переопределено) ---");
        animal2.makeSound();
        animal2.move();
        
        System.out.println("\n--- Cat (переопределено) ---");
        animal3.makeSound();
        animal3.move();
        
        System.out.println("\n--- Ковариантный возвращаемый тип ---");
        Animal cloneAnimal = animal1.getClone();
        Dog cloneDog = (Dog) animal2.getClone();
        System.out.println("Клон создан: " + cloneDog.name);
        
        System.out.println("\n--- final метод (нельзя переопределить) ---");
        animal2.cannotOverride();
        
        System.out.println("\n========== ДОПОЛНИТЕЛЬНЫЙ ПРИМЕР StringHelper ==========");
        StringHelper sh = new StringHelper();
        System.out.println(sh.join("Hello", "World"));
        System.out.println(sh.join("Hello", " ", "World"));
        System.out.println(sh.join("Value: ", 42));
        System.out.println(sh.join(100, " points"));
        
        System.out.println("\n========== ПОЛИМОРФИЗМ С Shape ==========");
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Circle(3),
            new Rectangle(2, 8)
        };
        
        for(Shape s : shapes) {
            s.draw();
            System.out.println("Площадь: " + s.getArea());
            System.out.println();
        }
        
        System.out.println("\n========== ПРАВИЛА ==========");
        System.out.println("1. Перегрузка (overloading) - одинаковое имя, разные параметры");
        System.out.println("2. Переопределение (override) - переопределение метода в подклассе");
        System.out.println("3. @Override - аннотация для проверки правильности переопределения");
        System.out.println("4. final методы нельзя переопределить");
    }
}