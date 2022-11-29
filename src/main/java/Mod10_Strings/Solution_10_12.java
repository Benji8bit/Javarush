package Mod10_Strings;

/*
Обновление пути
*/

public class Solution_10_12 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        return path.replaceAll(path.substring(path.indexOf("jdk"), path.indexOf("/", path.indexOf("jdk"))), jdk);
    }
}
