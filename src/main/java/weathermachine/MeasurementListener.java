package weathermachine;

/**
 * @author 孙继峰
 * @since 2020/10/25
 */
public interface MeasurementListener {
    /**
     * 当测量数据改变时的通知
     * @param temp 温度
     * @param humidity 湿度
     * @param windPower 风力
     */
    void onChange(int temp, int humidity, int windPower);
}
