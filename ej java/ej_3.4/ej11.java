/**
 * ej 11 relacion 3.4
 * 
 * DGC
 */
public class ej11 {
  public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Kb a convertir: ");
   linea = System.console().readLine();
   double kb;
   kb = Double.parseDouble(linea);
   
   double mb;
   mb = kb / 1000;
   
   System.out.println(kb + "Kb equivale a: " + mb + "Mb");
  }
}
