package Mod12_Classes;

/*
Объекты внутренних и вложенных классов
*/

public class Solution_12_8 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}

