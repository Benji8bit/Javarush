package Mod14_Collections;

public class Solution_14_20 {
    public static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();
        for (JavarushQuest quest :
                quests) {
            System.out.println(quest);
        }

        for (JavarushQuest quest :
                quests) {
            System.out.println(quest.ordinal());
        }

    }
}
