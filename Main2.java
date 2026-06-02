import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

// Своя аннотация
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface BaseAction {
    int level();
}

// Класс с @Deprecated
class OldLibrary {
    @Deprecated
    public void oldMethod() {
        System.out.println("Старый метод");
    }
    
    public void newMethod() {
        System.out.println("Новый метод");
    }
}

// Класс с @Override
class Animal {
    public void sound() {
        System.out.println("Звук животного");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Гав-гав");
    }
}

// Использование своей аннотации
@BaseAction(level = 5)
class MyClass {
    public void show() {
        BaseAction annotation = this.getClass().getAnnotation(BaseAction.class);
        System.out.println("Уровень аннотации: " + annotation.level());
    }
}

public class Main {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        // @Override
        System.out.println("=== @Override ===");
        Dog dog = new Dog();
        dog.sound();
        
        // @Deprecated
        System.out.println("\n=== @Deprecated ===");
        OldLibrary lib = new OldLibrary();
        lib.oldMethod();  // Предупреждение, но работает
        lib.newMethod();
        
        // @SuppressWarnings
        System.out.println("\n=== @SuppressWarnings ===");
        List rawList = new ArrayList();  // Без предупреждения
        rawList.add("строка");
        System.out.println(rawList);
        
        // Своя аннотация
        System.out.println("\n=== Своя аннотация ===");
        MyClass obj = new MyClass();
        obj.show();
    }
}