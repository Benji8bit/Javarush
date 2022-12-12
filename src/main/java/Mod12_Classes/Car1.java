package Mod12_Classes;

public class Car1 {

    Engine engine;

    public class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }

    }
}
