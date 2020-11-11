/**
*ej2 realcion 3.4
*
*DGC
*/
public class ej2 {
  public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Euros a convertir: ");
   linea = System.console().readLine();
   double euros;
   euros = Double.parseDouble(linea);
   
   double pesetas;
   pesetas = euros * (double) ( (double) 1500 / (double) 9);
   
   System.out.println(euros + " euros equivale a: " + pesetas + " pesetas");
  }
}
