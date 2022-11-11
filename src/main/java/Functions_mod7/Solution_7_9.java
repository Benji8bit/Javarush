package Functions_mod7;/*
Замок чернобайта
*/

public class Solution_7_9 {
    public static String[] deadMen = {"мертвец_1", "мертвец_2", "мертвец_3", "мертвец_4", "мертвец_5",
            "мертвец_6", "мертвец_7", "мертвец_8", "мертвец_9", "мертвец_10"};

    public static void main(String[] args) {
        for (String deadMan : deadMen) {
            System.out.println(destroyDeadMan(deadMan));
        }
    }

    public static String destroyDeadMan(String name) {
        return (name + " был уничтожен");
    }
}