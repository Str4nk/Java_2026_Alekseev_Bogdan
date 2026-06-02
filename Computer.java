public class Computer {
    
    public class Processor {
        public String model = "Intel i7";      // public - доступен везде
        private double frequency = 3.4;        // private - только внутри Processor
        protected int cores = 8;               // protected - доступен в пакете и подклассам
        String manufacturer = "Intel";         // default - доступен в пакете
    }
    
    public class Memory {
        public int size = 16;
        private String type = "DDR4";
    }
    
    public void testAccess() {
        Processor cpu = new Processor();
        
        // Доступ к public полю 
        System.out.println("Модель: " + cpu.model);
        
        // Доступ к private полю  Ошибка!
        // System.out.println("Частота: " + cpu.frequency);
        
        // Доступ к protected полю - (тот же пакет)
        System.out.println("Ядра: " + cpu.cores);
        
        // Доступ к default полю - (тот же пакет)
        System.out.println("Производитель: " + cpu.manufacturer);
        
        Memory ram = new Memory();
        
        // Доступ к public 
        System.out.println("Память: " + ram.size);
        
        // Доступ к private 
        // System.out.println("Тип: " + ram.type);
    }
    
    // Метод, который пытается получить доступ к private полю из другого метода
    public void tryAccessPrivate() {
        Processor cpu = new Processor();
        // cpu.frequency = 4.0;  // Ошибка! private недоступен
    }
    
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.testAccess();
    }
}