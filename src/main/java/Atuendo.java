import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;
  private Prenda accesorio;

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado, Prenda accesorio) {
    this.verificar(superior,Categoria.PARTE_SUPERIOR);
    this.superior = superior;
    this.verificar(inferior,Categoria.PARTE_INFERIOR);
    this.inferior = inferior;
    this.verificar(calzado,Categoria.CALZADO);
    this.calzado = calzado;
    this.verificar(accesorio,Categoria.ACCESORIOS);
    this.accesorio = accesorio;
  }

  public void verificar(Prenda prenda, Categoria categoria){
    if (prenda.getCategoria() != categoria ) {
      throw new WrongCategoryException("categoria erronea");
    }
  }
}
