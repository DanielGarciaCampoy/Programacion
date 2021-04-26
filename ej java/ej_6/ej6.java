import java.util.Scanner;

public class ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //generacion
    int numero = (int) (Math.random() * 101);

    System.out.print("Intenta adivinar el nº (del 0 al 100), tienes 5 intentos: ");

    //intentos
    int i = 5;
    int intento = 0;
    do {

    intento = s.nextInt();
    i--;

    if (intento == numero) {
      System.out.println("Acertaste, el numero era: " + numero);
    } else {

      if (i == 0) {
        System.out.println("Se te acabaron los intentos, el numero era: " + numero);
      } else {
        if (numero > intento) {
          System.out.println(" (mayor)");
        } else {
          System.out.println(" (menor)");
        } 
        System.out.print("Fallo, te quedan " + i + " intentos: ");
      }

    }

    } while (!(i < 1 || intento == numero));

  }
}
