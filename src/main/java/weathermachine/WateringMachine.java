package weathermachine;

public class WateringMachine implements MeasurementListener {
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void start() {
        status = true;
    }

    public void onChange(int temp, int humidity, int windPower) {
        int tempThreshold = 10;
        int humidityThreshold = 55;
        int windPowerThreshold = 4;
        if (temp > tempThreshold && humidity < humidityThreshold && windPower < windPowerThreshold) {
            this.start();
        }
    }
}

