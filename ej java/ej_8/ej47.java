import matematicas.Varias;

public class ej47 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    int a[] = {8};
    System.out.println(convierteArrayEnString(a));
  }

  /**
   * Función que comvierte un array en String.
   *
   * @param a array que se quiere convertir en string.
   * @return un string de con los elementos array.
   */
  public static String convierteArrayEnString(int[] a) {
    String numero = "";
    for (int i = 0; i < a.length; i++) {
      numero += a[i];
    }
    return numero;
  }
}