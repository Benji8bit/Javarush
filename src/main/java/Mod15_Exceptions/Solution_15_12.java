package Mod15_Exceptions;

/*
Группировка исключений
*/

public class Solution_15_12 {

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (IllegalStateException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        } catch (InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
        }
    }
}

