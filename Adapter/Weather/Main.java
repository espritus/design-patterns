package project.com;

public class Main {

    public static void main(String[] args) {
        ThirdPartyWeatherAPI thirdPartyWeatherData = new ThirdPartyWeatherAPI(); //our "other" service
        WeatherAPI weatherAPI = new WeatherAPIAdapter(thirdPartyWeatherData); // "turning on" our adapter
        WeatherData weatherData = weatherAPI.getWeatherData("Almaty");// choosing city

        weatherData.showWeather();

    }
}
