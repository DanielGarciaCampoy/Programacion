/**
 * clase caballo
 */
public class caballo {

  //clases
  private String nombre;
  private String color;
  private int edad;
  private int carrerasGanadas;

  //superclase
  caballo (String n, String c, int e, int cg) {
    this.nombre = n;
    this.color = c;
    this.edad = e;
    this.carrerasGanadas = cg;
  }

  //get y void
  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public int getCarrerasGanadas() {
    return this.carrerasGanadas;
  }

  public void cabalga() {
    System.out.println("cabalgando...");
  }

  public void come() {
    System.out.println("comiendo...");
  }

  public void grita() {
    System.out.println("aaaaaaaaaaaaaaaaaa");
  }

}
