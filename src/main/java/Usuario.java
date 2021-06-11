import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  //lista de guardarropas para el requerimiento 1, en un futuro tal vez se quiera agregar parametros a los guardarropas para modelar
  //las distintas situaciones
  List<Guardarropa> guardarropas = new ArrayList<>();
  MedioContacto medioContacto;

  private void agregarMedioContacto(MedioContacto contacto){
    this.medioContacto = contacto;
  }

  //para compartir un guardarropas se me ocurre que por el momento es suficiente que dos usuarios conozcan la misma instancia
  //de un guardarropas para que puedan usarlo compartidamente. Pense en agregar un metodo compartirGuardarropas pero no entiendo donde
  //ubicarlo para que no me haga ruido

  //Un usuario debe poder registrar las sugerencias que le realizan
  List<Sugerencia> listaSugerencias = new ArrayList<Sugerencia>();

  //mostrar lista de sugerencias pendientes de aceptar o rechazar
  public List<Sugerencia> getListaSugerencias() {
    return listaSugerencias.stream().filter(sugerencia -> sugerencia.estadoSugerencia == EstadoSugerencia.PENDIENTE).collect(Collectors.toList());
  }

  public void compartirGuardarropaCon(Usuario usuario, Guardarropa guardarropa) {

  }

  public void agregarSugerencia(Sugerencia sugerencia){
    listaSugerencias.add(sugerencia);
  }



}
