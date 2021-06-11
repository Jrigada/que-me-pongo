import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Guardarropa {
  List<Prenda> prendas = new ArrayList<>();
  private GeneradorSugerencias generador;
  private Usuario usuarioDuenio;

  public Atuendo sugerirAtuendo(Meteorologo meteorologo) {
    BigDecimal temperatura = meteorologo.getTemperature("Buenos Aires, Argentina");
    Atuendo atuendo = obtenerAtuendoSegunTemperatura(temperatura);
    return atuendo;
  }

  public void addPrenda(Prenda prendas) {
    this.prendas.add(prendas);
  }

  private Atuendo obtenerAtuendoSegunTemperatura(BigDecimal temperatura) {
    return generador.generarAtuendosDesde(
        prendas.stream().filter(prenda -> !(prenda.soyAdecuadoParaClima(temperatura))).collect(Collectors.toList())
    );
  }

  private boolean temperaturaAdecuada(Integer temperaturaActual, Prenda prenda) {
    return prenda.getTemperaturaMaxima() <= temperaturaActual;
  }

  public void sugerirAtuendoLluvioso(Meteorologo meteorologo) {
  }

  public void alertarUsuario(Map<String, Object> alerta) {
    usuarioDuenio.medioContacto.notificar(alerta);
  }
}
