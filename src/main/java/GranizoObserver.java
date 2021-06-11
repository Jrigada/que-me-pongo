import java.util.Map;

public class GranizoObserver implements AlertaObserver {

  @Override
  public void alertaRecibida(Map<String, Object> alerta) {
    if (alerta.containsKey("Granizo")) {
      sugerenciaManager.dispararAlertaGranizo();
    }
    sugerenciaManager.dispararSugerencias();
  }
}
