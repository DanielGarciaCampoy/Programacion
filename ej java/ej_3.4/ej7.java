/**
*ej7 realcion 3.4
*
*DGC
*/
public class ej7 {
  public static void main(String args[]) {
    
    String linea;
    
    System.out.print("Precio factura sin IVA: ");
    linea = System.console().readLine();
    double sinIVA;
    sinIVA = Double.parseDouble(linea);

    double conIVA;
    conIVA = sinIVA * 1.21;
    System.out.println("Precio con IVA: " + conIVA);
  }
}
