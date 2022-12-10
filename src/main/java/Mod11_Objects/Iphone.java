package Mod11_Objects;

import java.util.Objects;

/*
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Iphone))
            return false;

        Iphone iphone = (Iphone) obj;

        if (this.model != (iphone.model))
            return false;

        if (this.color != (iphone.color))
            return  false;

        if (this.price != (iphone.price))
            return false;

        return this.model.equals (iphone.model);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

