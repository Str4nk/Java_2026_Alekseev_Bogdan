import java.util.*;

public class GenericInstanceOf {
    
    public static void main(String[] args) {
        
        System.out.println("=== instanceof с параметризованными классами ===\n");
        
        // Пример 1: Базовое использование
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Integer> integerWrapper = new Wrapper<>(100);
        
        // ✅ instanceof работает с "сырым" типом (raw type)
        System.out.println("stringWrapper instanceof Wrapper: " + (stringWrapper instanceof Wrapper));
        System.out.println("integerWrapper instanceof Wrapper: " + (integerWrapper instanceof Wrapper));
        
        // ❌ НЕЛЬЗЯ проверить конкретный параметризованный тип
        // System.out.println(stringWrapper instanceof Wrapper<String>);  // Ошибка компиляции!
        
        // Пример 2: Проверка с использованием wildcard
        if (stringWrapper instanceof Wrapper<?>) {
            System.out.println("stringWrapper является Wrapper<?>");
        }
        
        // Пример 3: Практическое использование с иерархией
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        
        System.out.println("\nstrings instanceof List: " + (strings instanceof List));
        System.out.println("integers instanceof List: " + (integers instanceof List));
        
        // Пример 4: С пользовательскими классами
        Container<Animal> animalContainer = new Container<>(new Animal("Animal"));
        Container<Dog> dogContainer = new Container<>(new Dog("Buddy"));
        
        // Проверка сырого типа
        System.out.println("\nanimalContainer instanceof Container: " + (animalContainer instanceof Container));
        System.out.println("dogContainer instanceof Container: " + (dogContainer instanceof Container));
        
        // Пример 5: Проверка перед приведением типа
        processContainer(animalContainer);
        processContainer(dogContainer);
        
        // Пример 6: С несколькими параметрами
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        if (pair instanceof Pair) {
            System.out.println("\npair является Pair (raw type)");
        }
    }
    
    public static void processContainer(Container<?> container) {
        // Можно проверить только сырой тип
        if (container instanceof Container) {
            Object item = container.getItem();
            System.out.println("Container содержит: " + item);
        }
    }
}

// ===== ВСПОМОГАТЕЛЬНЫЕ КЛАССЫ =====

class Wrapper<T> {
    private T item;
    
    public Wrapper(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}

class Container<T> {
    private T item;
    
    public Container(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}

class Animal {
    String name;
    Animal(String name) { this.name = name; }
    public String toString() { return "Animal: " + name; }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    public String toString() { return "Dog: " + name; }
}

class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}