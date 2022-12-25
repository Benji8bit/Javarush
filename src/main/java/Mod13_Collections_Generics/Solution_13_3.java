package Mod13_Collections_Generics;

/*
Экстренная посадка
*/

public class Solution_13_3 {

    public static TransportShip ship;

    static {
        ship = new TransportShip();
        ship.speed = 1000;
        ship.acceleration = 500;
        ship.passengers = new Passenger[]{new Passenger("Диего"), new Passenger("Амиго")};
    }

    public static void main(String[] args) {
        Integer delay = ship.onBoardSystem.calculateJumpTime(12345);
        for (Passenger passenger : ship.passengers) {
            passenger.jump(delay);
        }
    }
}

