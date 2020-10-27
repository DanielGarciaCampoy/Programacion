/**
*ej3 realcion 3.4
*
*DGC
*/
public class ej3 {
  public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Pesetas a convertir: ");
   linea = System.console().readLine();
   double pesetas;
   pesetas = Double.parseDouble(linea);
   
   double euros;
   euros = pesetas / (double) ( (double) 1500 / (double) 9);
   
   System.out.println(pesetas + " pesetas equivalen a: " + euros + " euros");
  }
}
