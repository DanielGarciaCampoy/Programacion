/**
 * Ejercicio 1 relacion 4.5
 * 
 * DGC
 */

public class ej1 {
  public static void main (String [] args) {
    System.out.println("Este programa muestra que asignatura toca a primera hora.");
    System.out.print("Por favor, introduzca un dia de la semana (lunes - domingo): ");
    String dia = System.console().readLine();

    switch (dia) {
      case "lunes": 
        System.out.println("A primera hora tenemos EED");
        break;
      case "martes", "miercoles", "jueves":
        System.out.println("A primera hora tenemos Programacion");
        break;
      case "viernes":
        System.out.println("A primera hora tenemos FOL");
        break;
      case "sabado", "domingo":
        System.out.println("No hay clase");
        break;
      }
  }
}
