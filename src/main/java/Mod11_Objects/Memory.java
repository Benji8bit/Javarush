package Mod11_Objects;

import java.util.Arrays;
import java.util.Objects;

/*
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String temp = "";
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i; j < array.length; j++) {
                    if (array[j] == null) continue;
                    else {
                        temp = array[j];
                        index = j;
                        array[i] = temp;
                        array[index] = null;
                        break;
                    }
                }
            } else
                continue;
        }
    }
}

