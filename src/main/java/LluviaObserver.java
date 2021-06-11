import java.util.Map;

public class LluviaObserver implements AlertaObserver {

  @Override
  public void alertaRecibida(Map<String, Object> alerta) {
    if (alerta.containsKey("Lluvia")) {
      sugerenciaManager.dispararSugerenciasLluviosas();
    }
    sugerenciaManager.dispararSugerencias();
  }
}
