package lesson_38.code.lessoncode.homeWork.task_02;

public class Main {

    public static void main(String[] args) {
        IntegerCalculator calculator = (a, b) -> a + b;
        int result = calculator.calculateSum(5, 3);
        System.out.println(result); // Выводит "8"
    }
}