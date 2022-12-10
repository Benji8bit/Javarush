package Mod11_Objects;

import java.util.Objects;

/*
Создаем свой hashCode
*/

public class Car1 {
    private String model;
    private int year;

    public Car1(String model, int year) {
        this.model = model;
        this.year = year;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car1 car1 = (Car1) o;
        return year == car1.year && model.equals(car1.model);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        Car1 lamborghini = new Car1("Lamborghini", 2020);
        Car1 lamborghini1 = new Car1("Lamborghini", 2020);
        Car1 ferrari = new Car1("Ferrari", 2020);
        Car1 ferrari1 = new Car1("Ferrari", 2020);
        Car1 bugatti = new Car1("Bugatti", 2020);
        Car1 bugatti1 = new Car1("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
