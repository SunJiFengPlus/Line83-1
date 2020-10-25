package weathermachine;

public class SeedingMachine implements MeasurementListener {
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void start() {
        status = true;
    }

    public void onChange(int temp, int humidity, int windPower) {
        int tempThreshold = 5;
        if (temp > tempThreshold) {
            this.start();
        }
    }
}
