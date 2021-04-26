/**
 * ej9
 */
public class ej9 {

  public static void main(String[] args) {
    
    int[] numero = new int[8];
    int i;
      
    System.out.println("Introduzca 8 números enteros y vaya pulsado Enter despues de cada número:");

    for (i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    for (int n:numero) {
        
      if (n % 2 == 0) {
        System.out.println(n + " par");
      }else {
        System.out.println(n + " impar");
      }
      
    }
  }
}