package weathermachine;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ReapingMachineTest {

    @ParameterizedTest
    @CsvSource({
            "1,1,1,false",
            "6,1,1,false",
            "6,66,1,true"
    })
    public void testOnChange(int temp, int humidity, int windPower, boolean status) {
        ReapingMachine reapingMachine = new ReapingMachine();
        reapingMachine.onChange(temp, humidity, windPower);

        assertThat(reapingMachine.getStatus()).isEqualTo(status);
    }
}