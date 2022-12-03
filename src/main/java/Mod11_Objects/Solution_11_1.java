package Mod11_Objects;

/*
Голограммный проектор
*/

public class Solution_11_1 {

    public static HologramProjector projector;

    public static void main(String[] args) {
        String[] spareParts = new String[]{
                "пустые бутылки из-под электролитов",
                "лампа с отражателем",
                "металлические опилки",
                "цветосмесительный призматический блок",
                "глушитель",
                "сломанная винтовка \"Тесла\"",
                "конденсор",
                "полупроницаемые зеркала-фильтры",
                "магниевые свечи",
                "объектив",
                "старый световой меч",
                "полисиликоновая матрица",
                "треснувшая нагрудная пластина"
        };

       projector = new HologramProjector(spareParts[9],
                spareParts[11], spareParts[6],
                spareParts[1], spareParts[3], spareParts[7]);
    }
}

