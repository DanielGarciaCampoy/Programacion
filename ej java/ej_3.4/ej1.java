/**
*ej1 realcion 3.4
*
*DGC
*/
public class ej1 {
  public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Introduzca un numero: ");
   linea = System.console().readLine();
   double numero1;
   numero1 = Double.parseDouble(linea);
   
   System.out.print("Introduce otro: ");
   linea = System.console().readLine();
   double numero2;
   numero2 = Double.parseDouble(linea);
   
   double total = numero1 * numero2;
   
   System.out.println("El primer numero es: " + numero1);
   System.out.println("El segundo numero es: " + numero2);
   System.out.println("La multiplicacion de ambos es: " + total);
  }
}
