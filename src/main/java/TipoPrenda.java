public class TipoPrenda {
  Categoria categoria;
  Integer temperaturaMaximaAdecuada;

  public Categoria getCategoria() {
    return categoria;
  }

  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Integer getTemperaturaMaximaAdecuada() {
    return temperaturaMaximaAdecuada;
  }
}
