package Mod13_Collections_Generics;

public class Solution_13_15 {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
