package zadatak3;

public class WeatherStationClient {

    private PrimaryInterface weatherStation;

    public WeatherStationClient(PrimaryInterface weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void setWeatherStation(PrimaryInterface weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void useWeatherStation() {
        weatherStation.showWeaherData();
    }
}
