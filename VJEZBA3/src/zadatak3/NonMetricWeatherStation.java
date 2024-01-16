package zadatak3;

public class NonMetricWeatherStation {

    private double temperatureF;
    private double windSpeedKn;

    public NonMetricWeatherStation(double temperatureF, double windSpeedKn) {
        this.temperatureF = temperatureF;
        this.windSpeedKn = windSpeedKn;
    }

    public double getTemperatureF() {
        return temperatureF;
    }

    public double getWindSpeedKn() {
        return windSpeedKn;
    }

    public void showWeatherData() {
        System.out.println(STR."Temperature: \{temperatureF} F");
        System.out.println(STR."Wind speed: \{windSpeedKn} kn");
    }

    public void readTempF() {
        System.out.println(STR."Temperature is \{temperatureF} degrees Fahrenheit.");
    }

    public void readWindSpeedKn() {
        System.out.println(STR."Wind speed is \{windSpeedKn} kn.");
    }
}
