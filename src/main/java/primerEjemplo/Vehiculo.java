package primerEjemplo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Vehiculo {
  public enum Color {ROJO, VERDE, AZUL}

  // SECCIÓN DE ATRIBUTOS

  private Color color;
  private final int numSerie;

  // SECCIÓN DE MÉTODOS

  /**
   * Construye un vehículo
   * @param color color del vehiculo
   * @param numSerie número de serie del vehículo
   */
  public Vehiculo(Color color, int numSerie) {
    this.color = color;
    this.numSerie = numSerie;
  }
}
