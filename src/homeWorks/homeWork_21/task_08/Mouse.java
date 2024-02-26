package homeWorks.homeWork_21.task_08;

public class Mouse extends InputDevice {
    // Реализация метода для подключения мыши
    @Override
    public void connect() {
        System.out.println("Mouse connected");
    }

    // Реализация метода для отключения мыши
    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected");
    }
}
