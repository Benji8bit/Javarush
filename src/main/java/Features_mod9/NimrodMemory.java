package Features_mod9;

/*
Очистка памяти корабля
*/

public class NimrodMemory {

    public static long[] santaFabrica = new long[99000];
    public static long[] eroticSimulators = new long[100500];

    public static void main(String[] args) {
        // test
        markForDeletion();
        System.out.println(Long.toBinaryString(santaFabrica[0]));
    }

    public static void markForDeletion() {
        for (int i = 0; i < santaFabrica.length; i++) {
            santaFabrica[i] = santaFabrica[i] | (0b100000001000000010000000000000);
            //santaFabrica[i] = santaFabrica[i] | (1 << 21);
            //santaFabrica[i] = santaFabrica[i] | (1 << 29);
        }

        for (int i = 0; i < eroticSimulators.length; i++) {
            eroticSimulators[i] = eroticSimulators[i] | (1 << 13);
            eroticSimulators[i] = eroticSimulators[i] | (1 << 21);
            eroticSimulators[i] = eroticSimulators[i] | (1 << 29);
        }

        /*for (long e: santaFabrica) {
            e |= 1 << 13;
            e |= 1 << 21;
            e |= 1 << 29;
        }*/

        /*for (long e: eroticSimulators) {
            e = e | (1 << 13);
            e = e | (1 << 21);
            e = e | (1 << 29);
        }*/
    }
}

