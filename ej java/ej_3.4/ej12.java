/**
 * ej 12 relacion 3.4
 * 
 * DGC
 */
public class ej12 {
  public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Nota del 1er examen: ");
   linea = System.console().readLine();
   double examen;
   examen = Double.parseDouble(linea);
   
   System.out.print("Nota que quieres sacar: ");
   linea = System.console().readLine();
   double nota;
   nota = Double.parseDouble(linea);
   
   double examen2;
   examen2 = (nota - nota * 0.4) / 0.6;
   
   System.out.println("Para sacar la nota deseada, tienes que sacar un " + examen2 + " en el 2ndo examen");
  }
}
