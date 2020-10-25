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
        if (temp > 10 && humidity < 55 && windPower < 4) {
            this.start();
        }
    }
}

