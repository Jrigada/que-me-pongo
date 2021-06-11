import java.util.Map;

public interface AlertaObserver {
  SugerenciasManager sugerenciaManager = new SugerenciasManager();

  public void alertaRecibida(Map<String, Object> alerta);
}
