import matematicas.Varias;

public class ej16 {

  public static void main(String[] args) {

    for(int i = 1; i < 99999; i++) {
      if (matematicas.Varias.esCapicua(i)) {
        System.out.print(i + "  ");
      }
    }
  }
}