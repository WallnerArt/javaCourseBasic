package lesson_21.code.lessoncode.homeWork_21.task_04;
public class SystemConfiguration {
    // Приватные поля для конфигурационных параметров системы
    private int logLevel;
    private String logFilePath;

    // Конструктор для инициализации конфигурационных параметров системы
    public SystemConfiguration(int logLevel, String logFilePath) {
        this.logLevel = logLevel;
        this.logFilePath = logFilePath;
    }

    // Метод для получения уровня логирования
    public int getLogLevel() {
        return logLevel;
    }

    // Метод для установки уровня логирования
    // Уровень логирования должен быть от 0 до 5
    public void setLogLevel(int logLevel) {
        if (logLevel >= 0 && logLevel <= 5) {
            this.logLevel = logLevel;
            System.out.println("Log level set to " + logLevel);
        } else {
            System.out.println("Invalid log level. Log level must be between 0 and 5.");
        }
    }

    // Метод для получения пути к файлам логов
    public String getLogFilePath() {
        return logFilePath;
    }

    // Метод для установки пути к файлам логов
    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
        System.out.println("Log file path set to " + logFilePath);
    }
}


