package Mod10_Strings;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Solution_10_14 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        int i = 0;
        String[] strings = new String[st.countTokens()];
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            strings[i] = token;
            i++;
        }
        return strings;
    }
}

