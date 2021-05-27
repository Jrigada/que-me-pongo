import java.math.BigDecimal;

import static java.util.Objects.requireNonNull;

public class Prenda {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;
  private BigDecimal tempMax;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Boolean soyAdecuadoParaClima(BigDecimal temp) {
    return this.tempMax.compareTo(temp) != -1;
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public Integer getTemperaturaMaxima() {return tipoPrenda.getTemperaturaMaximaAdecuada();}

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
