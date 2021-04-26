/**
 * programa para usar la clase caballo
 */
public class usarCaballo {
  public static void main(String[] args) {
    
    caballo a = new caballo("juan", "negro", 5, 0);
    System.out.println("me llamo " + a.getNombre());
    a.grita();
    System.out.println("tengo " + a.getEdad() + " años");

    System.out.println("");

    caballo b = new caballo("antonio", "blanco", 10, 5);
    System.out.println("me llamo " + b.getNombre());
    b.cabalga();
    b.come();
    System.out.println("he ganado " + b.getCarrerasGanadas() + " carreras");

  }

}
