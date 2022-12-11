package Mod12_Classes;

/*
Био-Нано-Боты
*/

public class Solution_12_0 {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        Class[] playlist = new Class[] {DoomMetal.class, HeavyMetal.class,
        GlamMetal.class, ThrashMetal.class, SpeedMetal.class, PowerMetal.class,
        DeathMetal.class, BlackMetal.class, ProgressiveMetal.class, GothicMetal.class,
        SymphonicMetal.class, FolkMetal.class, AlternativeMetal.class,
        IndustrialMetal.class, Metalcore.class};

        sysadmin.load(playlist);

    }
}
