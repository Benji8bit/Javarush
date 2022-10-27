public class Mrakobes {
    public static boolean isAlive = true;

    public static void setIsAlive(boolean bo) {
        Mrakobes.isAlive = bo;
    }

    public static void printState() {
        System.out.println("Амиго" + (isAlive ? " НЕ " : " ") + "победил Мракобеса Безумного");
    }
}
