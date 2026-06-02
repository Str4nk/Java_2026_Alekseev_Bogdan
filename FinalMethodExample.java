public class FinalMethodExample {
    
    static class Animal {
        public void makeSound() {
            System.out.println("Животное издает звук");
        }
        
        public final void breathe() {
            System.out.println("Животное дышит воздухом");
        }
    }
    
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Собака лает: Гав-гав");
        }
        
        // final-метод переопределить НЕЛЬЗЯ
        // Раскомментировать строки ниже - ошибка компиляции
        // @Override
        // public void breathe() {
        //     System.out.println("Собака дышит");
        // }
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.breathe();
    }
}