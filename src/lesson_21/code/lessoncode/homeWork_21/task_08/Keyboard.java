package lesson_21.code.lessoncode.homeWork_21.task_08;

public class Keyboard extends InputDevice {
    // Реализация метода для подключения клавиатуры
    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }

    // Реализация метода для отключения клавиатуры
    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected");
    }
}
