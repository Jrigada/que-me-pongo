import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  List<Prenda> guardarropas = new ArrayList<>();

  public void addPrenda(Prenda prenda) {
    this.guardarropas.add(prenda);
  }

  public List<Prenda> sugerenciaSimple() {
    Integer temperaturaActual = new Meteorologo().getTemperature();
    List<Prenda> sugerencia = new ArrayList<>();
    sugerencia.add(sugerirParteSuperior(temperaturaActual));
    sugerencia.add(sugerirParteInferior(temperaturaActual));
    sugerencia.add(sugerirCalzado(temperaturaActual));
    return sugerencia;
  }

  public Prenda sugerirParteSuperior(Integer temperaturaActual) {
    return guardarropas.stream().filter(prenda->prenda.getCategoria() == Categoria.PARTE_SUPERIOR && temperaturaAdecuada(temperaturaActual, prenda)).findFirst().orElse(null);
  }

  public Prenda sugerirParteInferior(Integer temperaturaActual) {
    return guardarropas.stream().filter(prenda->prenda.getCategoria() == Categoria.PARTE_INFERIOR&& temperaturaAdecuada(temperaturaActual, prenda)).findFirst().orElse(null);
  }
  public Prenda sugerirCalzado(Integer temperaturaActual) {
    return guardarropas.stream().filter(prenda->prenda.getCategoria() == Categoria.CALZADO && temperaturaAdecuada(temperaturaActual, prenda)).findFirst().orElse(null);
  }

  private boolean temperaturaAdecuada(Integer temperaturaActual, Prenda prenda) {
    return prenda.getTemperaturaMaxima() <= temperaturaActual;
  }
}
