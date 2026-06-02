public class ThisConstructorExample {
    
    static class A {
        int a;
        int b;
        int c;
        int z;
        
        // Базовый конструктор - инициализирует z = 1
        public A() {
            this.z = 1;
        }
        
        // Вызывает A()
        public A(int a) {
            this();           // вызов A() для установки z = 1
            this.a = a;
        }
        
        // Вызывает A(int a)
        public A(int a, int b) {
            this(a);          // вызов A(int a) для установки a и z
            this.b = b;
        }
        
        // Вызывает A(int a, int b)
        public A(int a, int b, int c) {
            this(a, b);       // вызов A(int a, int b) для установки a, b и z
            this.c = c;
        }
        
        void print() {
            System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", z=" + z);
        }
    }
    
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(10);
        A obj3 = new A(10, 20);
        A obj4 = new A(10, 20, 30);
        
        System.out.println("Конструктор A():");
        obj1.print();
        System.out.println("\nКонструктор A(int a):");
        obj2.print();
        System.out.println("\nКонструктор A(int a, int b):");
        obj3.print();
        System.out.println("\nКонструктор A(int a, int b, int c):");
        obj4.print();
    }
}