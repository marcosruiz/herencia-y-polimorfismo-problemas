package ejemploHerencia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coche extends Vehiculo{

  // SECCIÓN DE ATRIBUTOS

  private int cilindrada;

  // SECCIÓN DE MÉTODOS

  /**
   * Construye un coche
   * @param color color del coche
   * @param numSerie número de serie del coche
   * @param cilindrada cilindrada del coche
   */
  public Coche(Color color, int numSerie, int cilindrada) {
    super(color, numSerie);
    this.cilindrada = cilindrada;
  }

}
