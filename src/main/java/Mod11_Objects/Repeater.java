package Mod11_Objects;

public class Repeater {
    private String trajectory = "parabolic";
    private int frequency = 30;

    public String getTrajectory() {
        return this.trajectory;
    }

    public void setTrajectory(String trajectory) {
        this.trajectory = trajectory;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("Repeater trajectory is %s, with a %dGHz communication frequency.", trajectory, frequency);
    }
}
