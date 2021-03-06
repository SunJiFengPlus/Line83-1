package weathermachine;

import java.util.HashSet;
import java.util.Set;

public class WeatherData {

    private final Set<MeasurementListener> listeners = new HashSet<>();

    public void measurementsChanged(int temp, int humidity, int windPower) {
        listeners.forEach(listener -> listener.onChange(temp, humidity, windPower));
    }

    public void register(MeasurementListener listener) {
        this.listeners.add(listener);
    }

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        register(seedingMachine);
        register(reapingMachine);
        register(wateringMachine);
    }
}

