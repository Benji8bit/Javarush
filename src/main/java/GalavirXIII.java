/*Атака на
Зелёного кардинала*/

public class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public void defend(double d) {
        health -= (superWeapon / d);
    }

    public int attack() {
        return superWeapon;
    }
}