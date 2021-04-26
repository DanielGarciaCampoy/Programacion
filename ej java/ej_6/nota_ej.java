public class nota_ej {
  public static void main(String[] args) {
    
    System.out.println("Notas del 1 a 10:");
    for (int i = 1; i < 20; i++) {
      int nota = (int) (Math.random() * 10) + 1;

      if (nota < 5) {
        System.out.print("\033[31m" + nota + "  ");
      } else {
        System.out.print("\033[92m" + nota + "  ");
      }
    }

  }
}
