/**
 * Ejercicio 2 relacion 4.5
 * 
 * DGC
 */
public class ej2 {
  public static void main(String []args) {
      System.out.print("Diga la hora (en formato 24h): ");
      int hora;
      hora = Integer.parseInt(System.console().readLine());
      
      String saludo;
    
      switch (hora) {
      
      case 6, 7, 8, 9, 10, 11, 12:
      saludo = "buenos dias";
      break;
      
      case 13, 14, 15, 16, 17, 18, 19, 20:
      saludo = "buenas tardes";
      break;
      
      case 21, 22, 23, 24, 1, 2, 3, 4, 5:
      saludo = "buenas noches";
      break;
       
      default:
      saludo = "Error"; 
      }

      System.out.println("Son las " + hora + ", " + saludo);
  }
}
