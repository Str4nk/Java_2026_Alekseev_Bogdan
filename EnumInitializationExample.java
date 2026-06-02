public class EnumInitializationExample {
    
    // Перечисление с инициализацией элементов
    public enum Planet {
        MERCURY(3.30e23, 2.44e6),
        VENUS(4.87e24, 6.05e6),
        EARTH(5.97e24, 6.38e6),
        MARS(6.42e23, 3.40e6),
        JUPITER(1.90e27, 6.99e7),
        SATURN(5.68e26, 5.82e7),
        URANUS(8.68e25, 2.54e7),
        NEPTUNE(1.02e26, 2.46e7);
        
        private final double mass;    // масса в кг
        private final double radius;  // радиус в метрах
        
        // Конструктор перечисления (всегда private)
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }
        
        public double getMass() { return mass; }
        public double getRadius() { return radius; }
        
        // Вычисление поверхностной гравитации
        public double surfaceGravity() {
            final double G = 6.67430e-11;
            return G * mass / (radius * radius);
        }
        
        public double surfaceWeight(double massKg) {
            return massKg * surfaceGravity();
        }
    }
    
    
    // Перечисление с размером одежды
    public enum Size {
        XS(38, "Extra Small"),
        S(40, "Small"),
        M(42, "Medium"),
        L(44, "Large"),
        XL(46, "Extra Large"),
        XXL(48, "Double Extra Large");
        
        private final int chestCircumference;
        private final String description;
        
        Size(int chestCircumference, String description) {
            this.chestCircumference = chestCircumference;
            this.description = description;
        }
        
        public int getChestCircumference() { return chestCircumference; }
        public String getDescription() { return description; }
        
        public boolean isLargerThan(Size other) {
            return this.chestCircumference > other.chestCircumference;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПЛАНЕТЫ ===\n");
        for (Planet p : Planet.values()) {
            System.out.printf("%s: масса = %.2e кг, радиус = %.2e м, гравитация = %.2f м/с²%n",
                p.name(), p.getMass(), p.getRadius(), p.surfaceGravity());
        }
        
        System.out.println("\nВес на разных планетах (75 кг):");
        double earthWeight = 75;
        for (Planet p : Planet.values()) {
            System.out.printf("%s: %.2f кг%n", p.name(), p.surfaceWeight(earthWeight));
        }
        
     
        
        System.out.println("\n=== РАЗМЕРЫ ОДЕЖДЫ ===\n");
        Size mySize = Size.L;
        System.out.println("Мой размер: " + mySize + " - " + mySize.getDescription());
        
        System.out.println("\nСравнение размеров:");
        System.out.println(Size.XL + " больше чем " + Size.M + "? " + Size.XL.isLargerThan(Size.M));
        System.out.println(Size.S + " больше чем " + Size.L + "? " + Size.S.isLargerThan(Size.L));
    }
}