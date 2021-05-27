public class Borrador {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario = null;
  Trama trama = Trama.LISA;
  private Guardarropa guardarropa;

  public void especificarTipo(TipoPrenda tipoPrenda) throws Exception {
    if (tipoPrenda == null) {
      throw new NullParameterException("tipoPrenda is missing");
    }
    this.tipoPrenda = tipoPrenda;
  }

  public void especificarMaterial(Material material) {
    if (tipoPrenda == null) {
      throw new NullParameterException("material is missing");
    }
    this.material = material;
  }

  public void especificarColorPrimario(Color colorPrimario) {
    if (tipoPrenda == null) {
      throw new NullParameterException("colorPrimario is missing");
    }
    this.colorPrimario = colorPrimario;
  }

  public void especificarColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void especificarTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda crearPrenda() {
    Prenda prendaCreada = new Prenda(tipoPrenda,material,colorPrimario,colorSecundario,trama);
    guardarropa.addPrenda(prendaCreada);
    return prendaCreada;
  }
}
