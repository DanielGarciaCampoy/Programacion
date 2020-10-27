/**
*ej5 realcion 3.4
*
*DGC
*/
public class ej5 {
  public static void main(String args[]) {
    
    String linea;
    
    System.out.print("Base del rectangulo: ");
    linea = System.console().readLine();
    double base;
    base = Double.parseDouble(linea);

    System.out.print("Altura del rectangulo: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble(linea);
    
    double area;
    area = base * altura;
    System.out.println("Area del rectangulo: " + area);
  }
}
