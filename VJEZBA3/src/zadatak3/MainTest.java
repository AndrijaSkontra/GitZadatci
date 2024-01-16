package zadatak3;

public class MainTest {

    public static void main(String[] args) {

        WeatherStationClient weatherStationClient = new WeatherStationClient(new MetricWeatherServiceStation(20, 10.2, 5.6));
        weatherStationClient.useWeatherStation();

        System.out.println("\nLets switch the interface...\n");

        weatherStationClient.setWeatherStation(new NonMetricToMetricAdapter(new NonMetricWeatherStation(49.56, 91.23)));
        weatherStationClient.useWeatherStation();
    }
}
