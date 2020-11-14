/**
 * ej 7 relacion 4.5
 * 
 * DGC
 */
public class ej7 {
  public static void main(String []args) {
    
    System.out.println("Calcular la media de tres notas:");
    
    System.out.print("1era nota: ");
    double nota1;
    nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("2nda nota:");
    double nota2;
    nota2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("3era nota:");
    double nota3;
    nota3 = Integer.parseInt(System.console().readLine());
    
    double media;
    media = (nota1 + nota2 + nota3) / 3;
    System.out.println("La media es: " + media);
  }
}
