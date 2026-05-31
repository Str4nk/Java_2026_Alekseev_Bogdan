public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();

        moveVehicle(vehicle1);
        moveVehicle(vehicle2);
    }

    static void moveVehicle(Vehicle vehicle) {
        vehicle.move();
    }
}

class Vehicle {
    public void move() {
        System.out.println("Транспорт движется");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Машина едет");
    }
}
