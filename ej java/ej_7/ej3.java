

public class ej3 {
  public static void main(String[] args) {

    int[] n = new int[9];

    System.out.println("Introduzca 10 nº:");
    for (int i = 0; i < 9; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.print("El orden inverso es: ");
    for (int e = 9; e > 0; e--) {
      System.out.print(n[e] + " ");
    }

  }
}
