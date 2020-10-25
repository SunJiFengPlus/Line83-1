package weathermachine;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class SeedingMachineTest {

    @ParameterizedTest
    @CsvSource({
            "1,1,1,false",
            "6,1,1,true"
    })
    public void testOnChange(int temp, int humidity, int windPower, boolean status) {
        SeedingMachine seedingMachine = new SeedingMachine();
        seedingMachine.onChange(temp, humidity, windPower);

        assertThat(seedingMachine.getStatus()).isEqualTo(status);
    }
}