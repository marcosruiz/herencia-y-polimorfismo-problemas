package ejemploHerencia;

public class Barco extends Vehiculo{
  /**
   * Construye un barco
   * @param color color del barco
   * @param numSerie número de serie del barco
   */
  public Barco(Color color, int numSerie) {
    super(color, numSerie);
  }
}
