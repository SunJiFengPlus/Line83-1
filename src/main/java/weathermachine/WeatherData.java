package weathermachine;

import java.util.HashSet;
import java.util.Set;

public class WeatherData {

    private Set<MeasurementListener> listeners = new HashSet<>();

    public void measurementsChanged(int temp, int humidity, int windPower) {
        listeners.forEach(listener -> listener.onChange(temp, humidity, windPower));
    }

    public void register(MeasurementListener listener) {
        this.listeners.add(listener);
    }
}

