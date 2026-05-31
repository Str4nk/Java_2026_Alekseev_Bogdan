class Animal {}
class Dog extends Animal {}

public class SimpleInstanceOf {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Animal animal = new Animal();
        
        // Основные примеры
        System.out.println(dog instanceof Dog);     // true
        System.out.println(dog instanceof Animal);  // true
        System.out.println(animal instanceof Dog);  // false
        
        // null всегда false
        Dog nullDog = null;
        System.out.println(nullDog instanceof Dog);  // false
        System.out.println(null instanceof Animal);  // false
        
        // Практическое использование
        Object obj = "Hello";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("Длина строки: " + str.length());
        }
    }
}