package project.com;

public class ThirdPartyWeatherData {
    private String city;
    private int windSpeed;
    private int temperature;

    public ThirdPartyWeatherData(String city, int windSpeed, int temperature) {
        this.city = city;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
    }

    public String getCity() {
        return this.city;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getWindSpeed() {
        return this.windSpeed;
    }
}
