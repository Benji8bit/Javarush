package Mod11_Objects;

/*
Прогноз погоды
*/

public class Solution_11_6 {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() +
                " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        City dubai = new City("Дубай", 40);
        showWeather(dubai);
    }
}
