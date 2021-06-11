import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SugerenciasManager {
  private List<Guardarropa> listaGuardarropasRegistrados = new ArrayList<>();
  private Meteorologo meteorologo;
  public List<Map<String,Object>> alertasPublicadas = new ArrayList<>();
  private List<AlertaObserver> observers;


  public void dispararSugerencias() {
    listaGuardarropasRegistrados.stream().forEach(guardarropa -> guardarropa.sugerirAtuendo(meteorologo));
  }

  public void actualizarAlertas() {
    Map<String,Object> alerta = meteorologo.getAlerta();
    observers.forEach(observer -> observer.alertaRecibida(alerta));
  }

  public void dispararAlerta(Map<String,Object> alerta) {
    listaGuardarropasRegistrados.stream().forEach(guardarropa -> guardarropa.alertarUsuario(alerta));
  }

  public void dispararSugerenciasLluviosas() {
    listaGuardarropasRegistrados.stream().forEach(guardarropa -> guardarropa.sugerirAtuendoLluvioso(meteorologo));
  }

  public void dispararAlertaGranizo() {
  }
}
