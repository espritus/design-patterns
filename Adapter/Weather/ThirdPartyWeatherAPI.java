package project.com;

public class ThirdPartyWeatherAPI {
    private String city;
    private int temperature;
    private int windSpeed;

    public ThirdPartyWeatherData getData(String location) {
        if(location.equals("London")){
            this.city = "London";
            this.windSpeed = 15;
            this.temperature = 20;
        }
        else if(location.equals("Almaty")){
            this.city = "Almaty";
            this.windSpeed = 10;
            this.temperature = 30;
        }
        return new ThirdPartyWeatherData(city,windSpeed,temperature);
    }
}
