import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface Meteorologo {

 BigDecimal getTemperature(String direccion);

 Map<String, Object> getAlerta();
}
