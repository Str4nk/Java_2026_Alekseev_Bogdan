public class OverrideAnnotationExample {
    
    static class Parent {
        public void processData() {
            System.out.println("Parent.processData");
        }
        
        public void save(String name) {
            System.out.println("Parent.save: " + name);
        }
    }
    
    static class Child extends Parent {
        
        // С аннотацией @Override компилятор проверит, что такой метод есть в Parent
        @Override
        public void processData() {
            System.out.println("Child.processData");
        }
        
        // ОШИБКА 1: опечатка в имени метода
        // @Override
        // public void processdata() {  // Раскомментировать - ошибка!
        //     System.out.println("Не переопределит, а создаст новый метод");
        // }
        
        // ОШИБКА 2: не совпадают параметры
        // @Override
        // public void processData(int x) {  // Ошибка! Параметры не совпадают
        //     System.out.println("Это не переопределение");
        // }
        
        // ОШИБКА 3: не совпадает возвращаемый тип
        // @Override
        // public int processData() {  // Ошибка! void vs int
        //     return 0;
        // }
        
        // ОШИБКА 4: опечатка в названии метода
        // @Override
        // public void saveName(String name) {  // Ошибка! Нет такого метода в Parent
        //     System.out.println("Хотели переопределить save, но ошиблись");
        // }
    }
    
    public static void main(String[] args) {
        Child child = new Child();
        child.processData();
        
        //Если бы не было @Override, ошибки остались бы незамеченными:"
        //processdata() (с маленькой д) создал бы новый метод"
        //processData(int x) тоже был бы новым методом"
        //saveName() не вызвал бы ошибки, но не переопределил save()"
        //Благодаря @Override компилятор сразу находит такие ошибки"
    }
}