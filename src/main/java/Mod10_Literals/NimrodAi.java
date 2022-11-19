package Mod10_Literals;

import java.util.Arrays;

public class NimrodAi {

    public static String[] diningRoom = {
            "button for emergency meeting",
            "table", "table", "table", "table", "table",
            "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench",
            "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench"};
    public static String[] o2 = {"plant", "plant"};
    public static String[] medRoom = {"bed", "bed", "bed", "bed", "SCAN-MO-TRON-2000", "liquid analyser"};
    public static String[] armoury = {"cannon launcher", "chair"};
    public static String[] securityRoom = {"rack", "rack", "table"};
    public static String[] reactor = {"reactor"};
    public static String[] telecom = {"computer", "computer", "computer", "table", "chair"};
    public static String[] warehouse = {
            "container", "container", "container",
            "box", "box", "box", "box", "box", "box",
            "barrel", "barrel", "barrel", "barrel"};
    public static String[] controlRoom = {"interactive ship map", "chair", "chair", "chair"};
    public static String[] powerRoom = {"power lamp", "power lamp", "power lamp", "power lamp", "power lamp", "power lamp", "power lamp"};

    public static void main(String[] args) {
        String[] rooms = {"diningRoom", "o2", "medRoom", "armoury",
                "securityRoom", "reactor", "telecom", "warehouse",
                "controlRoom", "powerRoom"};
        for (String room: rooms) {
            //checkPirates(room);
            if (checkPirates(room)) {
                openFloodgates(room);
            }
        }
    }

    public static boolean checkPirates(String roomName) {
        String[] room = getRoomByName(roomName);
        if (room == null) {
            return false;
        }

        String[] scanResult = RoomScanner.scanRoom(roomName);
        System.out.printf("В %s обнаружено: %s\n", roomName, Arrays.toString(scanResult));

        boolean flag = false;
        for (String itemsScan: scanResult) {
                if (Arrays.asList(room).contains(itemsScan))
                    continue;
                else flag = true;
            }

        if (scanResult.length > room.length) {
            return true;
        } else if (flag) {
            return true;
        }
        else if (Arrays.toString(scanResult).equalsIgnoreCase(Arrays.toString(room))) {
            return false;
        } else return false;
    }

    public static void openFloodgates(String roomName) {
        System.out.printf("ВНИМАНИЕ, открытие шлюзов в %s\n\n", roomName);
        Arrays.fill(getRoomByName(roomName), null);
    }

    public static String[] getRoomByName(String roomName) {
        return switch (roomName) {
            case "diningRoom" -> diningRoom;
            case "o2" -> o2;
            case "medRoom" -> medRoom;
            case "armoury" -> armoury;
            case "securityRoom" -> securityRoom;
            case "reactor" -> reactor;
            case "telecom" -> telecom;
            case "warehouse" -> warehouse;
            case "controlRoom" -> controlRoom;
            case "powerRoom" -> powerRoom;
            default -> null;
        };
    }
}

