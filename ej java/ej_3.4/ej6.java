/**
*ej6 realcion 3.4
*
*DGC
*/
public class ej6 {
  public static void main(String args[]) {
    
    String linea;
    
    System.out.print("Base del triangulo: ");
    linea = System.console().readLine();
    double base;
    base = Double.parseDouble(linea);

    System.out.print("Altura del triangulo: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble(linea);
    
    double area;
    area = (base * altura) / 2;
    System.out.println("Area del rectangulo: " + area);
  }
}
