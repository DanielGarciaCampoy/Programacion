import matematicas.Varias;

public class ej15 {
  public static void main(String[] args) {
    for (int i = 1; i < 1001; i++) {
      if (matematicas.Varias.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}