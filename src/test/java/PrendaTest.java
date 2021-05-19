import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  Color rojo = new Color(255,0,0);

  TipoPrenda remera = new TipoPrenda(Categoria.PARTE_SUPERIOR);


  @Test
  public void sePermiteCargarUnaPrendaSinColorSecundario() throws Exception {
    Borrador remeraRoja = new Borrador();
    remeraRoja.especificarTipo(remera());
    remeraRoja.especificarMaterial(Material.LANA);
    remeraRoja.especificarColorPrimario(rojo);
    Prenda prendaRemeraRoja = remeraRoja.crearPrenda();
    assertEquals(prendaRemeraRoja.getTipoPrenda(),remera());
    assertEquals(prendaRemeraRoja.getMaterial(),Material.LANA);
    assertEquals(prendaRemeraRoja.getColorPrimario(),rojo());
  }

  @Test
  public void sePermiteCargarUnaPrendaConColorSecundario() throws Exception {
    Borrador remeraRoja = new Borrador();
    remeraRoja.especificarTipo(remera());
    remeraRoja.especificarMaterial(Material.LANA);
    remeraRoja.especificarColorPrimario(rojo);
    remeraRoja.especificarColorSecundario(rojo);
    Prenda prendaRemeraRoja = remeraRoja.crearPrenda();
    assertEquals(prendaRemeraRoja.getColorPrimario(),rojo());
    assertEquals(prendaRemeraRoja.getColorSecundario(),rojo());
    assertEquals(prendaRemeraRoja.getTipoPrenda(),remera());
    assertEquals(prendaRemeraRoja.getMaterial(),Material.LANA);
  }

  @Test
  public void sePermiteIdentificarLaCategoriaDeUnaPrenda() throws Exception {
    Borrador remeraRoja = new Borrador();
    remeraRoja.especificarTipo(remera());
    remeraRoja.especificarMaterial(Material.LANA);
    remeraRoja.especificarColorPrimario(rojo);
    remeraRoja.especificarColorSecundario(rojo);
    Prenda prendaRemeraRoja = remeraRoja.crearPrenda();
    assertEquals(prendaRemeraRoja.getCategoria(),Categoria.PARTE_SUPERIOR);
  }


  private Color rojo() {
    return rojo;
  }

  private TipoPrenda remera() {
    return remera;
  }



}