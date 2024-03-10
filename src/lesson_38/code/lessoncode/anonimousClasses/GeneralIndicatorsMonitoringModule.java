package lesson_38.code.lessoncode.anonimousClasses;

public class GeneralIndicatorsMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг основных показателей стартовал!");
    }
}
