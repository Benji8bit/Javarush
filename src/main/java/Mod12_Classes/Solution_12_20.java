package Mod12_Classes;

/*
Затенение поля класса
*/

public class Solution_12_20 {
    public static int salary;

    public static void add(int increase) {
        //int salary = Solution_12_20.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
