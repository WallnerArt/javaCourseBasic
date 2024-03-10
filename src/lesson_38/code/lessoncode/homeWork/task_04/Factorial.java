package lesson_38.code.lessoncode.homeWork.task_04;
// Факториальный калькулятор
public class Factorial {
    // Метод для вычисления факториала числа
    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
