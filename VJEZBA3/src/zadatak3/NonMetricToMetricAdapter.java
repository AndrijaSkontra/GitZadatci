package zadatak3;

public class NonMetricToMetricAdapter implements PrimaryInterface{

    private NonMetricWeatherStation nonMetricWeatherStation;

    public NonMetricToMetricAdapter(NonMetricWeatherStation nonMetricWeatherStation) {
        this.nonMetricWeatherStation = nonMetricWeatherStation;
    }

    @Override
    public void readTempC() {
        nonMetricWeatherStation.readTempF();
        System.out.println(STR."Converted to Celsius -> \{convertFtoC(nonMetricWeatherStation.getTemperatureF())}");
    }

    private double convertFtoC(double temperatureF) {
        return (temperatureF - 32) * 5 / 9;
    }

    @Override
    public void readWindSpeedMS() {
        nonMetricWeatherStation.readWindSpeedKn();
        System.out.println(STR."Converted to m/s -> \{convertKnToMS(nonMetricWeatherStation.getWindSpeedKn())}");
    }

    private double convertKnToMS(double windSpeedKn) {
        return windSpeedKn * 0.514444444;
    }

    @Override
    public void showWeaherData() {
        readTempC();
        readWindSpeedMS();
    }
}
