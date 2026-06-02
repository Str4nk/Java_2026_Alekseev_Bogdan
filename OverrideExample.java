public class OverrideExample {
    
    static class Animal {
        public void makeSound() {
            System.out.println("Животное издает звук");
        }
        
        public String getName() {
            return "Животное";
        }
    }
    
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Собака лает");
        }
    }
    
    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Кошка мяукает");
        }
    }
    
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        
        a1.makeSound();  // Собака лает
        a2.makeSound();  // Кошка мяукает
    }
}