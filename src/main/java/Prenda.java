import static java.util.Objects.requireNonNull;

public class Prenda {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;

  TipoPrenda b_tipoPrenda;
  Material b_material;
  Color b_colorPrimario;
  Color b_colorSecundario;


  public void cargarTipoPrenda(TipoPrenda tipoPrenda) {
    this.b_tipoPrenda = tipoPrenda;
  }

  public void cargarAspecto(Material material, Color colorPrimario, Color colorSecundario) {
    this.b_material = material;
    this.b_colorPrimario = colorPrimario;
    this.b_colorSecundario = colorSecundario;
  }

  public void cargarAspecto(Material material, Color colorPrimario) {
  cargarAspecto(material,colorPrimario,null);
  }

  public void cargarAspecto(Color colorPrimario) {
    cargarAspecto(new Material(Trama.LISA),colorPrimario,null);
  }

  public void cargarAspecto(Color colorPrimario, Color colorSecundario) {
    cargarAspecto(new Material(Trama.LISA),colorPrimario,colorSecundario);
  }

  public void confirmarCarga() {
    tipoPrenda = b_tipoPrenda;
    material = b_material;
    colorPrimario = b_colorPrimario;
    colorSecundario = b_colorSecundario;
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

}
