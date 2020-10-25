package weathermachine;

public class ReapingMachine implements MeasurementListener {
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void start() {
        status = true;
    }

    public void onChange(int temp, int humidity, int windPower) {
        int tempThreshold = 5;
        int humidityThreshold = 65;
        if (temp > tempThreshold && humidity > humidityThreshold) {
            this.start();
        }
    }
}
