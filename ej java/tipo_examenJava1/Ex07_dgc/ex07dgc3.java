/**
 * Daniel Garcia Campoy
 * 11/11/20
 * 1DAM
**/
public class ex07dgc3 {
  public static void main(String[] args) {

    //introducir numero
    System.out.print("Introduzca un numero (de 9 cifras max.): ");
    int numero = Integer.parseInt(System.console().readLine());
    int numeroOriginal = numero;
    int numeroRecortado = 0;

    //cantidad de cifras
    int i = 1;
    do {
      i++;
      numero = numero / 10;
    } while (!(numero <= 9));

    //primer digito
    if (numero > i) {
      numeroRecortado = numeroOriginal;
    } else {

      //recorta el numero
      int ir = i - numero;
      numeroRecortado = (int) numeroOriginal / (int) Math.pow(10, ir);

    }

    //final
    System.out.println("Numero recortado: " + numeroRecortado);
  
  }
}
