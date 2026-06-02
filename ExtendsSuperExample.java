import java.util.*;

// ===== БАЗОВЫЕ КЛАССЫ ДЛЯ ПРИМЕРОВ =====

class Animal {
    String name;
    Animal(String name) { this.name = name; }
    public String toString() { return getClass().getSimpleName() + ": " + name; }
}

class Mammal extends Animal {
    Mammal(String name) { super(name); }
}

class Dog extends Mammal {
    Dog(String name) { super(name); }
}

class Cat extends Mammal {
    Cat(String name) { super(name); }
}

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

class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public String toString() {
        return key + "=" + value;
    }
}

// ===== ОСНОВНОЙ КЛАСС =====

public class ExtendsSuperExample {
    
    // Метод с <? extends T> - только чтение
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println("  " + a);
        }
    }
    
    // Метод с <? super T> - только запись
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog("Новая собака"));
    }
    
    // PECS: копирование из источника в приемник
    public static <T> void copyExtended(List<? extends T> source, List<? super T> dest) {
        for (T item : source) {
            dest.add(item);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("=== instanceof с параметризованными классами ===\n");
        
        // Пример 1: Базовое использование
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Integer> integerWrapper = new Wrapper<>(100);
        
        System.out.println("stringWrapper instanceof Wrapper: " + (stringWrapper instanceof Wrapper));
        System.out.println("integerWrapper instanceof Wrapper: " + (integerWrapper instanceof Wrapper));
        
        // Пример 2: Проверка с использованием wildcard
        if (stringWrapper instanceof Wrapper<?>) {
            System.out.println("stringWrapper является Wrapper<?>");
        }
        
        // Пример 3: С пользовательскими классами
        Container<Animal> animalContainer = new Container<>(new Animal("Animal"));
        Container<Dog> dogContainer = new Container<>(new Dog("Buddy"));
        
        System.out.println("\nanimalContainer instanceof Container: " + (animalContainer instanceof Container));
        System.out.println("dogContainer instanceof Container: " + (dogContainer instanceof Container));
        
        // Пример 4: С несколькими параметрами
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        if (pair instanceof Pair) {
            System.out.println("\npair является Pair (raw type): " + pair);
        }
        
        System.out.println("\n=== <? extends T> и <? super T> ===\n");
        
        // Создаем списки
        List<Animal> animals = new ArrayList<>(Arrays.asList(new Animal("Животное1"), new Animal("Животное2")));
        List<Mammal> mammals = new ArrayList<>(Arrays.asList(new Mammal("Млекопит1"), new Mammal("Млекопит2")));
        List<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog("Шарик"), new Dog("Бобик")));
        List<Cat> cats = new ArrayList<>(Arrays.asList(new Cat("Мурка"), new Cat("Барсик")));
        
        // ===== 1. <? extends T> =====
        System.out.println("=== <? extends T> (Producer Extends) ===");
        System.out.println("Можно ЧИТАТЬ элементы как тип T, но НЕЛЬЗЯ добавлять\n");
        
        printAnimals(mammals);
        printAnimals(dogs);
        printAnimals(cats);
        
        // ===== 2. <? super T> =====
        System.out.println("\n=== <? super T> (Consumer Super) ===");
        System.out.println("Можно ДОБАВЛЯТЬ элементы типа T, но ЧИТАТЬ можно только как Object\n");
        
        List<Animal> animalList = new ArrayList<>();
        List<Mammal> mammalList = new ArrayList<>();
        
        addDog(animalList);
        addDog(mammalList);
        
        System.out.println("Animal list: " + animalList);
        System.out.println("Mammal list: " + mammalList);
        
        // ===== 3. PECS правило =====
        System.out.println("\n=== PECS (Producer Extends, Consumer Super) ===");
        
        List<Dog> dogsList = new ArrayList<>(Arrays.asList(new Dog("Рекс"), new Dog("Джек")));
        
        List<? extends Mammal> producers = dogsList;
        Mammal m = producers.get(0);
        System.out.println("Прочитали: " + m);
        
        List<? super Dog> consumers = mammalList;
        consumers.add(new Dog("Бобик"));
        System.out.println("Добавили в consumers");
        
        // ===== 4. Пример copy =====
        System.out.println("\n=== Пример copy() ===");
        
        List<Dog> source = new ArrayList<>(Arrays.asList(new Dog("Дог1"), new Dog("Дог2")));
        List<Animal> dest = new ArrayList<>();
        
        copyExtended(source, dest);
        System.out.println("После copyExtended: " + dest);
        
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Number> nums = new ArrayList<>();
        copyExtended(ints, nums);
        System.out.println("Numbers: " + nums);
        
        
    }
}