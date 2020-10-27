/**
 * ej 10 relacion 3.4
 * 
 * DGC
 */
public class ej10 {
  public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Mb a convertir: ");
   linea = System.console().readLine();
   double mb;
   mb = Double.parseDouble(linea);
   
   double kb;
   kb = mb * 1000;
   
   System.out.println(mb + "Mb equivale a: " + kb + "Kb");
  }
}
