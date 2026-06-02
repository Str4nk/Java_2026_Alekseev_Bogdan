public class SuperExample {
    
    static class Parent {
        String name = "Родитель";
        
        Parent() {
            System.out.println("Конструктор Parent без параметров");
        }
        
        Parent(String msg) {
            System.out.println("Конструктор Parent: " + msg);
        }
        
        void show() {
            System.out.println("Метод show() из Parent");
        }
    }
    
    static class Child extends Parent {
        String name = "Ребенок";
        
        Child() {
            super();  // Вариант 1: вызов конструктора суперкласса
            System.out.println("Конструктор Child");
        }
        
        Child(String msg) {
            super(msg);  // Вариант 1: вызов конструктора суперкласса с параметром
        }
        
        void test() {
            // Вариант 2: доступ к полю суперкласса
            System.out.println("Поле name из Child: " + this.name);
            System.out.println("Поле name из Parent: " + super.name);
            
            // Вариант 3: доступ к методу суперкласса
            this.show();   // вызов метода Child
            super.show();  // вызов метода Parent
        }
        
        @Override
        void show() {
            System.out.println("Метод show() из Child");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Создание Child ===\n");
        Child child = new Child();
        child.test();
        
        System.out.println("\n=== Создание Child с параметром ===\n");
        Child child2 = new Child("Привет");
    }
}