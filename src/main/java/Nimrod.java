/*Атака на
Зелёного кардинала 2*/

public class Nimrod {
    public static int laser = 100000;
    public static int rocket = 10000;
    public static int angelicaKiss;

    public int health = 1000000;

    public void defend(int strike) {
        health -= applyShield(strike);
    }

    public int attack() {
        return angelicaKiss;
    }

    public byte applyShield(int strike) {
        return (byte) strike;
    }
}
