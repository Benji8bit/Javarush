public class Solution_3_5 {

    public static void main(String[] args) {
        int temperatureLow, temperatureMiddle, temperatureHigh, time;
        temperatureLow = 100;
        temperatureMiddle = 400;
        temperatureHigh = 1000;
        time = 50;
        String result = time > 40 ? "Мясо сгорело" : time < 35 ? "Мясо готовится" : "Мясо готово";

        System.out.println(result);
    }
}
