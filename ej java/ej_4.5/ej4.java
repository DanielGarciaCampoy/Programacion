/**
 * Ejercicio 4 relacion 4.5
 * 
 * DGC
 */
public class ej4 {
  public static void main (String []args) {
    
    System.out.print("Diga una hora: ");
    int hora;
    hora = Integer.parseInt(System.console().readLine());
    
    int total;
    int resta;
    int extra;
    
    if (hora >= 0 && hora <= 40) {
    total = hora * 12;
    System.out.println("Su salario semanal seria de: " + total + " euros"); }
    
    if (hora >= 41) {
    resta = hora * 40;
    extra = (40 * 12) + (resta * 16);
    System.out.println("Su salario semanal seria de: " + extra + " euros"); }
      
      if (hora < 0) {
        System.out.println("La hora introducida no es correcta, introduzca un num. positivo"); }
  }
}
