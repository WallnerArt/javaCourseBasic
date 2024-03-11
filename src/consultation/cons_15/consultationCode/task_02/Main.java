package consultation.cons_15.consultationCode.task_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherAnalyzer analyzer = new WeatherAnalyzer();
        WeatherData userWeatherData = getUserInput();
        analyzer.analyzeWeather(userWeatherData);
    }

    public static WeatherData getUserInput() {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        String description;

        while (true) {
            System.out.print("Введите температуру: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Некорректное значение. Попробуйте снова.");
                scanner.next(); // Очистка буфера сканера
            }
        }

        while (true) {
            System.out.print("Введите описание погоды: ");
            description = scanner.next();
            if (isValidDescription(description)) {
                break;
            } else {
                System.out.println("Некорректное описание погоды. Попробуйте снова.");
            }
        }

        return new WeatherData(temperature, description);
    }

    public static boolean isValidDescription(String description) {
        return description.equals("солнечно") || description.equals("облачно") || description.equals("дождь");
    }
}