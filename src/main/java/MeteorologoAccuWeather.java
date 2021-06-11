import java.math.BigDecimal;
import java.util.Map;

public class MeteorologoAccuWeather implements Meteorologo{
  private AccuWeatherAPI api;

  public MeteorologoAccuWeather(AccuWeatherAPI api) {
    this.api = api;
  }

  @Override
  public BigDecimal getTemperature(String direccion) {
    Map<String,Object> temperatura = consultarApi(direccion);
    return temperatura.get("Unit").equals("F") ? BigDecimal.valueOf((int) temperatura.get("Value") * 5L /8) : (BigDecimal) temperatura.get("Value");
  }

  private Map<String,Object> consultarApi(String direccion) {
    return (Map<String, Object>) this.api.getWeather(direccion).get(0).get("Temperature");
  }

  @Override
  public Map<String, Object> getAlerta() {
    return this.api.getAlertas();
  }
}
