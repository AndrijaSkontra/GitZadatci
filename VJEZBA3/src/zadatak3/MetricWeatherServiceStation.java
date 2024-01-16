package zadatak3;

import static java.lang.StringTemplate.STR;

public class MetricWeatherServiceStation implements PrimaryInterface{

    private double temperature;
    private double windSpeed;
    private double moisture;

    public MetricWeatherServiceStation(double temperature, double windSpeed, double moisture) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.moisture = moisture;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public void readTempC() {
        System.out.println(STR."Temperature is \{temperature} degrees Celsius.");
    }

    @Override
    public void readWindSpeedMS() {
        System.out.println(STR."Wind speed is \{windSpeed} m/s.");
    }

    @Override
    public void showWeaherData() {
        readTempC();
        readWindSpeedMS();
        System.out.println(STR."Moisture is \{moisture}%.");
    }
}
