
    public class App {
        public static void main(String[] args) {
            Shape r = new Rectangle(5, 4);
            Shape s = new Square(4);

            System.out.println("Rectangle area: " + r.getArea()); // 20
            System.out.println("Square area: " + s.getArea());     // 16
            
            printArea(new Rectangle(6, 3));
            printArea(new Square(5));
        }

        static void printArea(Shape shape) {
            System.out.println("Area = " + shape.getArea());
        }
    }

    interface Shape {
        int getArea();
    }

    class Rectangle implements Shape {
        private final int width;
        private final int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }

        public int getWidth() { return width; }
        public int getHeight() { return height; }
    }

    class Square implements Shape {
        private final int side;

        public Square(int side) {
            this.side = side;
        }

        @Override
        public int getArea() {
            return side * side;
        }

        public int getSide() { return side; }
    }
