import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  Color rojo = new Color(255,0,0);

  TipoPrenda remera = new TipoPrenda(Categoria.PARTE_SUPERIOR);

  Material lanaEstamada = new Material(Trama.ESTAMPADO);

  @Test
  public void sePermiteCargarUnaPrendaSinColorSecundario() {
    Prenda remeraRoja = new Prenda();
    remeraRoja.cargarTipoPrenda(remera());
    remeraRoja.cargarAspecto(lanaEstampada(),rojo());
    remeraRoja.confirmarCarga();
    assertEquals(remeraRoja.getColorPrimario(),rojo());
    assertEquals(remeraRoja.getTipoPrenda(),remera());
    assertEquals(remeraRoja.getMaterial(),lanaEstampada());
  }

  @Test
  public void sePermiteCargarUnaPrendaConColorSecundario() {
    Prenda remeraRoja = new Prenda();
    remeraRoja.cargarTipoPrenda(remera());
    remeraRoja.cargarAspecto(lanaEstampada(),rojo(),rojo());
    remeraRoja.confirmarCarga();
    assertEquals(remeraRoja.getColorPrimario(),rojo());
    assertEquals(remeraRoja.getColorSecundario(),rojo());
    assertEquals(remeraRoja.getTipoPrenda(),remera());
    assertEquals(remeraRoja.getMaterial(),lanaEstampada());
  }

  @Test
  public void sePermiteIdentificarLaCategoriaDeUnaPrenda() {
    Prenda remeraRoja = new Prenda();
    remeraRoja.cargarTipoPrenda(remera());
    remeraRoja.cargarAspecto(lanaEstampada(),rojo());
    remeraRoja.confirmarCarga();
    assertEquals(remeraRoja.getCategoria(),Categoria.PARTE_SUPERIOR);
  }


  private Color rojo() {
    return rojo;
  }

  private TipoPrenda remera() {
    return remera;
  }

  private Material lanaEstampada() {
    return lanaEstamada;
  }

}