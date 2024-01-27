package project.com;

public class WeatherAPIAdapter implements WeatherAPI {
    private ThirdPartyWeatherAPI api;
    private WeatherData weatherData;

    public WeatherAPIAdapter(ThirdPartyWeatherAPI api) {
        this.api = api;
    }

    public WeatherData getWeatherData(String location) {
        ThirdPartyWeatherData data = api.getData(location);
        WeatherData weatherData = new WeatherData();
        weatherData.setLocation(data.getCity());
        weatherData.setTemperature(data.getTemperature());
        weatherData.setWindSpeed(data.getWindSpeed());
        return weatherData;
    }
}
