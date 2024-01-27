package project.com;


public class WeatherData {
    private String location;
    private double temperature;
    private double windSpeed;

    public void setLocation(String city) {
        this.location = city;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
    public void showWeather(){
        System.out.println("Today "+this.location+" city has "+this.temperature +" temperature of C and "+ this.windSpeed +" of wind speed");
    }
}
