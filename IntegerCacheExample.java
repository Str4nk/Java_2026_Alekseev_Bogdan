public class IntegerCacheExample {
    public static void main(String[] args) {
        
        System.out.println("ДЛЯ 128");
        int i1 = 128;
        Integer a1 = i1;  // boxing - создается НОВЫЙ объект
        Integer b1 = i1;  // boxing - создается ЕЩЕ ОДИН НОВЫЙ объект
        System.out.println("a1==i1 " + (a1 == i1));        // true (распаковка a1)
        System.out.println("b1==i1 " + (b1 == i1));        // true (распаковка b1)
        System.out.println("a1==b1 " + (a1 == b1));        // false (разные объекты!)
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));  // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));  // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));  // true
        
        System.out.println("\nДЛЯ 127 ");
        int i2 = 127;
        Integer a2 = i2;  // boxing - берется из кеша
        Integer b2 = i2;  // boxing - берется ТОТ ЖЕ объект из кеша
        System.out.println("a2==i2 " + (a2 == i2));        // true (распаковка a2)
        System.out.println("b2==i2 " + (b2 == i2));        // true (распаковка b2)
        System.out.println("a2==b2 " + (a2 == b2));        // true (один объект из кеша!)
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));  // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));  // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));  // true
    }
}
