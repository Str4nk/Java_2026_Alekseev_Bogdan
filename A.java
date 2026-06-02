public class A {
    public final int a;
    
    // Способ 1: инициализация в конструкторе
    public A() {
        a = 10;
    }
    
    // Способ 2: инициализация в конструкторе с параметром
    public A(int value) {
        a = value;
    }
    
    // Способ 3: инициализация в блоке инициализации
    {
        // a = 20;  // работает, если нет инициализации в конструкторе
    }
    
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println("Способ 1 (конструктор без параметров): a = " + obj1.a);
        
        A obj2 = new A(50);
        System.out.println("Способ 2 (конструктор с параметром): a = " + obj2.a);
    }
}