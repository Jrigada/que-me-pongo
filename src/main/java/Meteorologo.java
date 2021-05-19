import java.util.List;
import java.util.Map;

public class Meteorologo {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");

  public int getPrecipitationProbability() {
   return (int) condicionesClimaticas.get(0).get("PrecipitationProbability");
  }

  public int getTemperature() {
    return (int) condicionesClimaticas.get(0).get("Temperature");
  }


}
