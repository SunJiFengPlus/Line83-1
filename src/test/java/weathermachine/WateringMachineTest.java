package weathermachine;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WateringMachineTest {

    @ParameterizedTest
    @CsvSource({
            "1,1,1,false",
            "11,1,1,true",
            "11,1,5,false",
            "11,55,1,false",
            "11,55,5,false"
    })
    public void testOnChange(int temp, int humidity, int windPower, boolean status) {
        WateringMachine wateringMachine = new WateringMachine();
        wateringMachine.onChange(temp, humidity, windPower);

        assertThat(wateringMachine.getStatus()).isEqualTo(status);
    }
}