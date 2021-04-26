public class vehiculo {

  private static int kmTotales = 0;
  private int kmRecorridos;

  public vehiculo() {
    this.kmRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kmRecorridos;
  }

  public static int getKmTotales() {
    return vehiculo.kmTotales;
  }

  public void recorre(int km) {
    this.kmRecorridos += km;
    kmTotales += km;
  }

}
