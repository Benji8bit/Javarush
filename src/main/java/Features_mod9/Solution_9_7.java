package Features_mod9;

import java.util.Random;

/*
Амиголятор и Био-диего
*/

//import static Features_mod9.CosmicAnomaly.*;

public class Solution_9_7 {

    public static void main(String[] args) {
        Random random = new Random();
        int myTry;
        int x;
        do {
            myTry = random.nextInt
                    (CosmicAnomaly.upperBound - CosmicAnomaly.lowerBound) + CosmicAnomaly.lowerBound;
            x = CosmicAnomaly.nextAttempt(myTry);
        }
        while (myTry != x);
    }
}
