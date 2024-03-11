package consultation.cons_15.consultationCode.task_02;
public class WeatherData {
    private double temperature;
    private String description;

    public WeatherData(double temperature, String description) {
        this.temperature = temperature;
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}