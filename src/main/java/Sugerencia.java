import java.util.List;

public class Sugerencia {

  private List<Prenda> atuendo;

  public Sugerencia(List<Prenda> atuendo) {
    this.atuendo = atuendo;
  }

  //deberia estar pendiente apenas la creo?
  public EstadoSugerencia estadoSugerencia = EstadoSugerencia.PENDIENTE;

  public EstadoSugerencia getEstadoSugerencia() {
    return estadoSugerencia;
  }

  public void AceptarSugerencia() {
    this.estadoSugerencia = EstadoSugerencia.ACEPTADA;
  }

  public void RechazarSugerencia() {
    this.estadoSugerencia = EstadoSugerencia.RECHAZADA;
  }

  //este metodo sera ejecutado por el usuario cuando quiera deshacer una sugerencia aceptada o rechazada
  //en un principio lo ubique en usuario pero me di cuenta que era un pasamanos.
  public void DeshacerCambioEstado() {
    this.estadoSugerencia = EstadoSugerencia.PENDIENTE;
  }
}
