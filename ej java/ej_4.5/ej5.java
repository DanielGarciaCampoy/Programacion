/**
 * ej 5 relacion 4.5
 * 
 * DGC
 */
public class ej5 {
  public static void main(String []args) {
    
    System.out.println("Ecuacion: ax+b=0");
  
    System.out.print("Valor de a: ");
    double a;
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Valor de b: ");
    double b;
    b = Integer.parseInt(System.console().readLine());
    
    double x;
    x = ((-1) * b) / a;
    System.out.println("x= " + x);
  }
}
