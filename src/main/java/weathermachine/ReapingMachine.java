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

    }
}
