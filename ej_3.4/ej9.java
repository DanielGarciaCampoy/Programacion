/**
*ej9 realcion 3.4
*
*DGC
*/
public class ej9 {
  public static void main(String args[]) {
    
    String linea;
    
    System.out.print("Radio del cono: ");
    linea = System.console().readLine();
    double radio;
    radio = Double.parseDouble(linea);

    System.out.print("Altura del cono: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble(linea);
    
    double volumen;
    volumen = (3.14 * radio * radio * altura) / 3;
    System.out.println("Volumen del cono: " + volumen);
  }
}
