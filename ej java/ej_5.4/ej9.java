/**
 * ej9 tema 6
 * DGC
 */
public class ej9 {
  public static void main(String[] args) {
    
    System.out.print("Cuantas cifras tiene el num.: ");
    int numero = Integer.parseInt(System.console().readLine());

    int i = 1;
    do {
      i++;
      numero = numero / 10;
    } while (numero >= 9);

    System.out.println("Tiene " + i + " cifras");

  }
}
