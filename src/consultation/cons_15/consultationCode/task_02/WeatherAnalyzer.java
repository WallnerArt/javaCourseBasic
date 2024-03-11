package consultation.cons_15.consultationCode.task_02;
import java.util.function.Function;
import java.util.function.Predicate;

public class WeatherAnalyzer {
    public static void main(String[] args) {
        WeatherData data = new WeatherData(25.0, "солнечно");

        WeatherAnalyzer analyzer = new WeatherAnalyzer();
        analyzer.analyzeWeather(data);
    }

    public void analyzeWeather(WeatherData data) {
        Predicate<Double> temperatureCheck = temp -> temp >= -50 && temp <= 50;
        Function<String, String> weatherDescriptionConverter = desc -> {
            if (desc.equals("солнечно")) {
                return "Не забудьте солнцезащитный крем!";
            } else if (desc.equals("облачно")) {
                return "Может быть, понадобится зонт.";
            } else if (desc.equals("дождь")) {
                return "Не забудьте зонт!";
            } else {
                return "Сегодняшняя погода: " + desc;
            }
        };

        if (temperatureCheck.test(data.getTemperature())) {
            String message = weatherDescriptionConverter.apply(data.getDescription());
            System.out.println(message);
        } else {
            System.out.println("Некорректные данные о погоде.");
        }
    }
}