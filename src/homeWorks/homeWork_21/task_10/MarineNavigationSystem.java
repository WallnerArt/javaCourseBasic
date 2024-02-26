package homeWorks.homeWork_21.task_10;

public class MarineNavigationSystem extends NavigationSystem {
    // Реализация метода для старта навигации в морской системе
    @Override
    public void startNavigation() {
        System.out.println("Marine navigation started");
    }

    // Реализация метода для завершения навигации в морской системе
    @Override
    public void stopNavigation() {
        System.out.println("Marine navigation stopped");
    }
}
