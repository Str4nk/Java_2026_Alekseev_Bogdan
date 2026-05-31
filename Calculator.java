/**
 * Простой калькулятор для демонстрации Javadoc
 * 
 * @author Студент
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Складывает два числа
     * 
     * @param a первое число
     * @param b второе число
     * @return сумму a и b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Вычитает одно число из другого
     * 
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Главный метод для демонстрации
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
    }
}