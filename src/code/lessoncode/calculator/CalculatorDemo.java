package code.lessoncode.calculator;

public class CalculatorDemo {
    public static class Calculator {
        public void sum(int x, int y){
            int result = x + y;
            System.out.println("Результат сложения = " + result);
        }

        public void multiplication(int x1, int y1){
            int resultMultiplication = x1 * y1;
            System.out.println("Результат умножения = " + resultMultiplication);
        }

    }
}
