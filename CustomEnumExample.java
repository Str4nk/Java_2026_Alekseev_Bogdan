public class CustomEnumExample {
    
    // Перечисление статусов заказа
    enum OrderStatus {
        PENDING("В ожидании", 1),
        PROCESSING("В обработке", 2),
        SHIPPED("Отправлен", 3),
        DELIVERED("Доставлен", 4),
        CANCELLED("Отменен", 5);
        
        private String rusName;
        private int code;
        
        OrderStatus(String rusName, int code) {
            this.rusName = rusName;
            this.code = code;
        }
        
        public String getRusName() { return rusName; }
        public int getCode() { return code; }
        
        public boolean isActive() {
            return this != CANCELLED && this != DELIVERED;
        }
    }
    
    // Перечисление дней недели
    enum DayOfWeek {
        MONDAY(1, "ПН"),
        TUESDAY(2, "ВТ"),
        WEDNESDAY(3, "СР"),
        THURSDAY(4, "ЧТ"),
        FRIDAY(5, "ПТ"),
        SATURDAY(6, "СБ"),
        SUNDAY(7, "ВС");
        
        private int number;
        private String shortName;
        
        DayOfWeek(int number, String shortName) {
            this.number = number;
            this.shortName = shortName;
        }
        
        public int getNumber() { return number; }
        public String getShortName() { return shortName; }
        
        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }
        
        public DayOfWeek next() {
            int nextIndex = (this.ordinal() + 1) % values().length;
            return values()[nextIndex];
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== СТАТУСЫ ЗАКАЗА ===\n");
        
        OrderStatus status = OrderStatus.PROCESSING;
        System.out.println("Статус: " + status.getRusName());
        System.out.println("Код: " + status.getCode());
        System.out.println("Активен: " + status.isActive());
        
        System.out.println("\nВсе статусы:");
        for (OrderStatus s : OrderStatus.values()) {
            System.out.println("  " + s.name() + " - " + s.getRusName());
        }
        
        System.out.println("\n=== ДНИ НЕДЕЛИ ===\n");
        
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Сегодня: " + today.name() + " (" + today.getShortName() + ")");
        System.out.println("Номер: " + today.getNumber());
        System.out.println("Выходной: " + today.isWeekend());
        System.out.println("Завтра: " + today.next().name());
        
        System.out.println("\nВсе дни:");
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println("  " + d.name() + " - " + d.getShortName());
        }
    }
}