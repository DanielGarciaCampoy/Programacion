/**
*ej8 realcion 3.4
*
*DGC
*/
public class ej8 {
  public static void main(String args[]) {
    
    String linea;
    
    System.out.print("Horas trabajadas a la semana: ");
    linea = System.console().readLine();
    double horas;
    horas = Double.parseDouble(linea);

    double salario;
    salario = horas * 12;
    System.out.println("Salario del trabajador: " + salario);
  }
}
